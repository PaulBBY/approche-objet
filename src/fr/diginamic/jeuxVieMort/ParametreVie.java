package fr.diginamic.jeuxVieMort;

import java.util.ArrayList;
import java.util.Scanner;

public class ParametreVie {
	
	public static Boolean estEscap(Scanner scan) {
		
		if (scan.nextInt()==1) {
			return false;
		} else return true;
	}
	
	public static int estInt(Scanner scan) {
		
		while (!scan.hasNextInt()) {
				System.out.println("\n\""+scan.next()+"\" n'est pas un entier ! Réessayez :\n");
		}
		
		int estInt = scan.nextInt();
		return estInt;	
		
	}
	
	
	
	public static ArrayList<Cellule> parametreVie(Scanner scanner){
		
		ArrayList<Cellule> matriceVie = CelluleFactory.cellulesMatrice();
		
		int[] cible = new int[2];
		
	
		
		Boolean generation = false;
		
		while(generation == false) {
			
			System.out.println("Nous allons définir les paramétres de la vie...");
			
			System.out.println("Donnez moi les coordonnées X d'une cellule à faire vivre");
			
			
			/*while(estInt(scanner)>=10 || estInt(scanner)<=0) {
				System.out.println("bla ça marche pas");
			}*/
			cible[0]= estInt(scanner);
			
			System.out.println("Donnez moi les coordonnées Y d'une cellule à faire vivre");
			
			/*while(estInt(scanner)>=5 || estInt(scanner)<=0) {
				System.out.println("bla ça marche pas2");
			}*/
			
			cible[1]=estInt(scanner);
			
			int index = 0;
			
			for(Cellule c : matriceVie) {
				if(c.getX()==cible[0] && c.getY()==cible[1]) {
					index = matriceVie.indexOf(c);
				}
			}
			
			matriceVie.get(index).setVivante(true);
			
		
			System.out.println("Voulez vous faire vivre une autre cellule ?");
			
			 generation = estEscap(scanner);
			
		}
		System.out.println("on es là");
		for(Cellule c : matriceVie) {
			System.out.println(c.toString());
		}
		return matriceVie;
		
	}

}
