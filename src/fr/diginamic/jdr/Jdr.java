package fr.diginamic.jdr;

import java.util.Random;
import java.util.Scanner;

public class Jdr {
	
	Random random = new Random();
	
	int estInt() {
		
		Scanner scan = new Scanner(System.in);
		
		while (!scan.hasNextInt()) {
				System.out.println("\n\""+scan.next()+"\" n'est pas une option disponible ! Réessayez :\n");
		}
		
		int estInt = scan.nextInt();
		
		return estInt;	
	}
	
	
	public void init() {
		
		Joueur joueur = new Joueur();
		
		System.out.println("Bienvenue dans la partie : vous avez "
				+joueur.getForce()+" points de force et "
				+joueur.getPdv()+" points de vie\n");
		
		menu(joueur);

	}
	
	public void menu(Joueur joueur) {
		
		System.out.println("Que voulez vous faire ?\n\n"
				+"1. Courir dans les bois en hurlant jusqu'à qu'adversaire s'en suive\n"
				+"2. Afficher votre score\n"
				+"3. Quitter la partie\n");
		
		int choix=estInt();
		
		switch(choix) {
			case 1:
				if(joueur.getPdv()>0) {
					rencontre(joueur);
				} else {
					System.out.println("Votre personnage est décédé. Il a obtenu le score de"+
				joueur.getScore()+" points");
				}
			
				break;
			case 2:
				score(joueur);
				break;
			case 3:	
				System.out.println("Vous quittez la partie avec un score de : "+joueur.getScore());
				break;
			default:
				System.err.println("Option non disponible");
		}	
	
	}
	
	public void rencontre(Joueur joueur) {
		
		Random random = new Random();
		
		Entite rencontre = null;
		
		switch(random.nextInt(1,4)) {
			case 1:
				rencontre = new Loup();
				System.out.println("\nUn gentil toutou vous mord la main, vous le mordez en retour\n");
				break;
			case 2: 
				rencontre = new Gobelin();
				System.out.println("\nUn gobelin malicieux vous vole votre argent, vous vous apprétez à lui voler sa vie\n");
				break;
			case 3:
				rencontre = new Troll();
				System.out.println("Un RickRoll résonne au loin : vous êtes pris au troll");
				break;
		}
		
		baston(rencontre, joueur);
		
	}
	
	public void baston(Entite rencontre, Joueur joueur) {


		System.out.println("Un combat acharné débute !");
		
		while(rencontre.getPdv()>0 && joueur.getPdv()>0) {
			  
			int attaqueJ = joueur.attaque();
			int attaqueR = rencontre.attaque();
			
			if(attaqueJ>attaqueR) {
				rencontre.setPdv(rencontre.getPdv()-(attaqueJ-attaqueR));
				System.out.println("Vous lui infligez : "+(attaqueJ-attaqueR)+" points de dégats\n"
						+"\nIl reste : "+rencontre.getPdv()+" pdv à l'adversaire !\n");
			} else if (attaqueJ<attaqueR) {
				joueur.setPdv(joueur.getPdv()-(attaqueR-attaqueJ));
				System.out.println("L'adverssaire vous inflige : "+(attaqueR-attaqueJ)+" points de vie\n"
						+"\nIl vous reste : "+joueur.getPdv()+" pdv à l'adversaire !\n");
			} else {
				System.out.println("Force égale, vous vous faites des bisous !");
			}
			
		}
		
		
		joueur.setScore(rencontre.score());
		System.out.println("Vous avez gagnés "+rencontre.score()
				+" à l'issue du combat, vous avez désormais "+joueur.getScore()+" points");
		menu(joueur);
	}
	
	public void score(Joueur joueur) {
		System.out.println("Votre score est de : "+joueur.getScore());
		menu(joueur);
	}

	public void quiter() {
		
	}
	

}
