package fr.diginamic.jeuxVieMort;

import java.util.Scanner;

public class askVie {

	public static Boolean estEscap(Scanner scan) {
		
		if (scan.nextInt()==0) {
			return false;
		} else return true;
	}
	
	public static int estIntX(Scanner scan) {
		
		while (scan.nextInt()<=0 || scan.nextInt()>10) {
			System.out.println("\n\""+scan.next()+"\" n'est pas un entier, ou dépasse les bornes de la matrice ! Réessayez :\n");
	}
	
		int estIntX = scan.nextInt();
		return estIntX;	
	}
	
	public static int estIntY(Scanner scan) {
		
		while (scan.nextInt()<=0 || scan.nextInt()>5) {
			System.out.println("\n\""+scan.next()+"\" n'est pas un entier, ou dépasse les bornes de la matrice ! Réessayez :\n");
	}
	
		int estIntY = scan.nextInt();
		return estIntY;	
	}
	public Boolean[][] askVie2(Scanner scanner){
		Boolean[][] test = new Boolean[1][1];
		return test;
		
	}
	
	Scanner scanner = new Scanner(System.in);
	
	public Boolean[][] askVie(Scanner scanner){
		
		Boolean [][] matriceVie = new Boolean[10][5];
		
		System.out.println("Nous allons renseignés la configuration initiale de la vie...");
		
		Boolean condWhile = true;
		
		while(condWhile == true) {
			System.out.println("Renseignez les coordonnées X de la cellule");
			int x = estIntX(scanner)-1;
			System.out.println("Renseignez les coordonnées Y de la cellule");
			int y = estIntY(scanner)-1;
			matriceVie[x][y]=true;
			System.out.println("Voulez vous rajouter une autre cellule?");
			condWhile = estEscap(scanner);
			
		}
		
		return matriceVie;
		
	}
}
