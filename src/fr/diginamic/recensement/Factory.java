package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Factory{

	public static Ville villeFactory (String codeRegion, String nomRegion, String codeDepartement, String codeCommune, String commune, int populationTotale) {
		return new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, commune, populationTotale);
	}
	
	public static Departement departementFactory(String codeRegion, String nomRegion, String codeDepartement, long populationDepartement) {
		return new Departement(codeRegion, nomRegion, codeDepartement, populationDepartement);
	}
	
	public static Region regionFactory(String codeRegion, String nomRegion, String codeDepartement, long populationRegion) {
		return new Region(codeRegion, nomRegion, codeDepartement, populationRegion);
		
	}
	
	
	public static Recensement init() throws IOException {
		
		ArrayList<Ville> recensement = new ArrayList<>();
		
		Path fichierVilles = Paths.get("C:\\Users\\Paul\\Documents\\7. Langage Java - approche objet\\Journée J7 - autoformation\\tp 16 - recensement population 2016.csv");
		List<String> bufferVilles = Files.readAllLines(fichierVilles, StandardCharsets.UTF_8);
		
		boolean enTete=true;
		
		for(String s: bufferVilles) {
			if(enTete) {
				enTete=false;
				continue;
			}
			String[] splited = s.split(";");
			String compactIntS = splited[7].replaceAll(" ", "");
			int populationTotale = Integer.parseInt(compactIntS);
			
			recensement.add(villeFactory(splited[0], splited[1], splited[2], splited[5], splited[6], populationTotale));
		}
		
		return new Recensement(recensement);
		
	}

	public static RecensementDepartements villeToDepartement(Recensement recensement) {
		
		ArrayList<Ville> recensementLocal = recensement.getRecensement();
		ArrayList<Departement> recensementDepartements = new ArrayList<>();
		
		boolean enTete=false;
		
		for(Ville v: recensementLocal) {
			if(enTete) {
				recensementDepartements.add(departementFactory(v.getCodeRegion(), v.getNomRegion(), v.getCodeDepartement(), v.getPopulationTotale()));
				enTete=false;
				continue;
			} else {
				for(int i = 0; true; i ++) {
					if(i==recensementDepartements.size()) {
						recensementDepartements.add(departementFactory(v.getCodeRegion(), v.getNomRegion(), v.getCodeDepartement(), v.getPopulationTotale()));
						break;
					}
					Departement d = recensementDepartements.get(i);
					if(d.getCodeDepartement().equals(v.getCodeDepartement())) {
						recensementDepartements.get(i).setPopulationDepartement(recensementDepartements.get(i).getPopulationDepartement()+v.getPopulationTotale());
						break;
					}
				}
			}
		}
		return new RecensementDepartements(recensementDepartements);
	}
	
	public static RecensementRegions departementToRegion(RecensementDepartements recensementDepartements) {
		
		ArrayList<Departement> recensementDepartementsLocal = recensementDepartements.getRecensementDepartement();
		ArrayList<Region> recensementRegions = new ArrayList<>();
		
		boolean enTete=true;
		
		for(Departement d: recensementDepartementsLocal) {
			if(enTete) {
				recensementRegions.add(regionFactory(d.getCodeRegion(), d.getNomRegion(), d.getCodeDepartement(), d.getPopulationDepartement()));
				enTete=false;
				continue;
			} else {
				for(int i = 0; true; i ++) {
					if(i==recensementRegions.size()) {
						recensementRegions.add(regionFactory(d.getCodeRegion(), d.getNomRegion(), d.getCodeDepartement(), d.getPopulationDepartement()));
						break;
					}
					Region r = recensementRegions.get(i);
					if(r.getCodeRegion().equals(d.getCodeRegion())) {
						recensementRegions.get(i).setPopulatioRegion(recensementRegions.get(i).getPopulatioRegion()+d.getPopulationDepartement());
						break;
					}
				}
			}
		}
		
		return new RecensementRegions(recensementRegions);
		
	}
	
	
	
}
