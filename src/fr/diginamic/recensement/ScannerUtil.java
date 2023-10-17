package fr.diginamic.recensement;

import java.util.Scanner;

public class ScannerUtil {
	
	public static String scanUtil(Scanner scan) {
		
		while (!scan.hasNext()) {
				System.out.println("Test");
		}
		
		String cible = scan.next();
		return cible;	
		
	}

}
