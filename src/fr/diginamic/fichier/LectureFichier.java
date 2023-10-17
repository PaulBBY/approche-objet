package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {
	
	public static Ville creaVille(String nom, String codeDepartement, String nomRegion, String nbHb) {
		return new Ville(nom, codeDepartement, nomRegion, nbHb);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Path path = Paths.get("C:\\Users\\Paul\\Documents\\7. Langage Java - approche objet\\Journée J5 & J6\\section 2 - traitement des fichiers\\recensement.csv");
		Path pathOut = Paths.get("C:\\Users\\Paul\\Documents\\7. Langage Java - approche objet\\Journée J5 & J6\\section 2 - traitement des fichiers\\recensementOut2.csv");
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		
		
		ArrayList<Ville> villes = new ArrayList<>();
		
		for(int i = 1; i<lines.size(); i++) {
			String[] l = lines.get(i).split(";");
			villes.add(creaVille(l[6], l[2], l[1], l[7]));
		}
		
		/*for(Ville v: villes) {
			System.out.println(v.toString());
		}*/
		
		ArrayList<Ville> villes2 = new ArrayList<>();
		
		String[] l= lines.get(0).split(";");
		
		villes2.add(creaVille(l[6], l[2], l[1], l[7]));
		
		for(int i = 1; i<lines.size()-1; i++) {
			String[] l2 = lines.get(i).split(";");
			String espace = l2[7].replaceAll(" ", "");
			int j = Integer.parseInt(espace);
			if(j>25000) {
				
				villes2.add(creaVille(l2[6], l2[2], l2[1], l2[7]));
			}
			
		}
		
		List<String> linesIn = new ArrayList<>();
		
		linesIn.add(villes2.get(0).getNom()+";"+villes2.get(0).getCodeDepartement()+";"+villes2.get(0).getNomRegion()+";"+villes2.get(0).getNbHb());
		
		for(int i = 1; i <= villes2.size()-1; i++) {
			linesIn.add(villes2.get(i).getNom()+";"+villes2.get(i).getCodeDepartement()+";"+villes2.get(i).getNomRegion()+";"+villes2.get(i).getNbHb());
		}
		
		Files.write(pathOut, linesIn);
	}

}
