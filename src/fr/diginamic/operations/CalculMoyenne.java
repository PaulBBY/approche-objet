package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
	
	double[] tableau;

	public void ajout(double nombre) {
		
		int taille = tableau.length;
		tableau = Arrays.copyOf(tableau, taille+1);
		tableau[taille]=nombre;
		
	}
	
	
	public void calcul() {
		
		double somme=0;
		for (double d : tableau) {
			somme+=d;
		}
		System.out.println(somme/tableau.length);
	}
}
