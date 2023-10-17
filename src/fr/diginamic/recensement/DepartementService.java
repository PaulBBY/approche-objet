package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DepartementService extends MenuService {
	

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("Quel est le code, ou le nom de votre département ?");

		
		String cible = ScannerUtil.scanUtil(scanner);
		
		RecensementDepartements recensementDepartements = Factory.villeToDepartement(recensement);
		
		ArrayList<Departement> arrayDepartements = recensementDepartements.getRecensementDepartement();
		
		for(Departement d: arrayDepartements) {
			if(d.getCodeDepartement().equals(cible)) {
				System.out.println(d.getCodeDepartement()+ " : "+d.getPopulationDepartement());
			}
		}
		
		
		
	}

	

	@Override
	public void top10(Recensement recensement) {
		// TODO Auto-generated method stub
		RecensementDepartements recensementDepartements = Factory.villeToDepartement(recensement);
		
		ArrayList<Departement> arrayDepartements = recensementDepartements.getRecensementDepartement();
		
		Collections.sort(arrayDepartements, new ComparatorDepartement().reversed());
		
		for(int i = 0; i<=10; i++) {
			System.out.println((i+1)+". "+arrayDepartements.get(i).getCodeDepartement()+" : "+arrayDepartements.get(i).getPopulationDepartement());
		}
		
	}
	

}
