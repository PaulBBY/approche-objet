package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RegionService extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		// TODO Auto-generated method stub
		
		System.out.println("Quel est le code, ou le nom de votre région ?");

		String cible = ScannerUtil.scanUtil(scanner);
		
		RecensementRegions recensementRegions = Factory.departementToRegion(Factory.villeToDepartement(recensement));

		ArrayList<Region> arrayRegion = recensementRegions.getRecensementRegions();
		
		for(Region r: arrayRegion) {
			if(r.getCodeRegion().equals(cible) || r.getNomRegion().equals(cible)) {
				System.out.println(r.getCodeRegion()+ " : "+r.getPopulatioRegion());
			}
		}
		
		
	}



	@Override
	public void top10(Recensement recensement) {
		// TODO Auto-generated method stub
		
		RecensementRegions recensementRegions = Factory.departementToRegion(Factory.villeToDepartement(recensement));

		ArrayList<Region> arrayRegion = recensementRegions.getRecensementRegions();
		
		Collections.sort(arrayRegion, new ComparatorRegion().reversed());
		
		for(int i = 0; i<=10; i++) {
			System.out.println((i+1)+". "+arrayRegion.get(i).getNomRegion()+" : "+arrayRegion.get(i).getPopulatioRegion());
		}
		
	}

}
