package fr.diginamic.formes;

import fr.diginamic.essais.AffichageForme;

public class TestForme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Forme cercle = new Cercle(4.0);
		Forme rectangle = new Rectangle(4.0, 2.0);
		Forme carre = new Carre(3.0);
		
		AffichageForme.affichageForme(cercle);
		AffichageForme.affichageForme(rectangle);
		AffichageForme.affichageForme(carre);

	}

}
