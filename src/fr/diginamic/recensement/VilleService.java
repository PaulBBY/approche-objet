package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class VilleService extends MenuService {
	
	Application app = new Application();


	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		// TODO Auto-generated method stub
		
		System.out.println("Quel est le code, ou le nom de votre ville ?");
		String cible = ScannerUtil.scanUtil(scanner);
		
		ArrayList<Ville> arrayVilles = recensement.getRecensement();
		
		for(Ville v: arrayVilles) {
			if(v.getCodeCommune().equals(cible) || v.getCommune().equals(cible)) {
				System.out.println(v.getCommune()+ " : "+v.getPopulationTotale());
			}
		}
		
		app.ApplicationService(recensement, scanner);
		
	}
	
	public void top10D(Recensement recensement, Scanner scanner) {
		
		String cible = ScannerUtil.scanUtil(scanner);
		
		ArrayList<Ville> arrayVilles = recensement.getRecensement();
		ArrayList<Ville> arrayVillesTr = new ArrayList<>();
		
		for (Ville v : arrayVilles) {
			if(v.getCodeDepartement().equals(cible)) {
				arrayVillesTr.add(v);
			}
		}
		
		Collections.sort(arrayVillesTr, new ComparatorVille().reversed());
		
		for(int i = 0; i<=10; i++) {
			System.out.println((i+1)+". "+arrayVillesTr.get(i).getCommune()+" : "+arrayVillesTr.get(i).getPopulationTotale());
		}
		
		
		

	}
	
	public void top10R(Recensement recensement, Scanner scanner) {
String cible = ScannerUtil.scanUtil(scanner);
		
		ArrayList<Ville> arrayVilles = recensement.getRecensement();
		ArrayList<Ville> arrayVillesTr = new ArrayList<>();
		
		for (Ville v : arrayVilles) {
			if(v.getCodeRegion().equals(cible) || v.getNomRegion().equals(cible)) {
				arrayVillesTr.add(v);
			}
		}
		
		Collections.sort(arrayVillesTr, new ComparatorVille().reversed());
		
		for(int i = 0; i<=10; i++) {
			System.out.println((i+1)+". "+arrayVillesTr.get(i).getCommune()+" : "+arrayVillesTr.get(i).getPopulationTotale());
		}
		

	}

	@Override
	public void top10(Recensement recensement) {
		// TODO Auto-generated method stub
		
		ArrayList<Ville> arrayVilles = recensement.getRecensement();
		Collections.sort(arrayVilles, new ComparatorVille().reversed());
		
		for(int i = 0; i<=10; i++) {
			System.out.println((i+1)+". "+arrayVilles.get(i).getCommune()+" : "+arrayVilles.get(i).getPopulationTotale());
		}
		
	}
	
	

}
