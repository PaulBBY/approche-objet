package fr.diginamic.operations;

public class Operations {

	public static double calcul (double a, double b, char signe) {
		double resultat;
		switch(signe) {
			case '+':
				resultat = a+b;
				break;
			case '-':
				resultat = a-b;
			case '%':
				resultat = a/b;
				break;
			case '*':
				resultat = a*b;
				break;
			default:
				resultat = 0;
		}
		return resultat;
	}
	
}
