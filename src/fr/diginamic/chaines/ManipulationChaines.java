package fr.diginamic.chaines;

import entites.Salarie;
import entites.Theatre;

public class ManipulationChaines {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chaine = "Durand;Marcel;2 523.5";
		
		
		
		
		String[] chaineT = chaine.split(";");
		
		String nom=chaineT[0];
		String prenom=chaineT[1];
		double salaire=Double.parseDouble(chaineT[2].replace(" ", ""));
		
		Salarie salarie = new Salarie(nom, prenom, salaire);
		
		System.out.println(salarie.getNom());
		System.out.println(salarie.toString());
	}


}
