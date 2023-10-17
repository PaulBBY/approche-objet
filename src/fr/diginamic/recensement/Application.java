package fr.diginamic.recensement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;




public class Application {
	
	
	public void ApplicationService(Recensement recensement, Scanner scanner) {
		
		
		System.out.println("1. Population d’une ville donnée\r\n"
				+ "2. Population d’un département donné\r\n"
				+ "3. Population d’une région donnée\r\n"
				+ "4. Afficher les 10 régions les plus peuplées\r\n"
				+ "5. Afficher les 10 départements les plus peuplés\r\n"
				+ "6. Afficher les 10 villes les plus peuplées d’un département\r\n"
				+ "7. Afficher les 10 villes les plus peuplées d’une région\r\n"
				+ "8. Afficher les 10 villes les plus peuplées de France\r\n"
				+ "9. Sortir");
		
		String choix = ScannerUtil.scanUtil(scanner);
		VilleService villeService = new VilleService();
		DepartementService departementService = new DepartementService();
		RegionService regionService = new RegionService();
		
		switch(choix) {
			case "1":
				villeService.traiter(recensement, scanner);
				break;
			case "2":
				departementService.traiter(recensement, scanner);
				break;
			case "3":
				regionService.traiter(recensement, scanner);
				break;
			case "4":
				regionService.top10(recensement);
				break;
			case "5":
				departementService.top10(recensement);
				break;		
			case "6":
				villeService.top10D(recensement, scanner);
				break;
			case "7":
				villeService.top10R(recensement, scanner);
				break;
				
			case "8":
				villeService.top10(recensement);
			case "9":
				break;
			default:
				ApplicationService(recensement, scanner);	
		}
	}
	 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
	
		Recensement v = Factory.init();
		/*RecensementDepartements d = Factory.villeToDepartement(v);
		RecensementRegions r = Factory.departementToRegion(d);
		
		VilleService vs = new VilleService();
		DepartementService ds = new DepartementService();
		RegionService rs = new RegionService();
		/*for(Ville v : recensement) {
			System.out.println(v.toString());
		}*/
		
		
		Application app = new Application();
		
		Scanner scanner = new Scanner(System.in);
		
		app.ApplicationService( v, scanner);
	}

}
