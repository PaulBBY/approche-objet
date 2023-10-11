package fr.diginamic.essais;

import fr.diginamic.salaire.*;


public class TestIntervenant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Intervenant pigiste = new Pigiste("Jean", "DUPONT", 3.0, 89.3);
		Intervenant salarie = new Salarie("Jean", "JACK", 1700.32);
		
	
		
		System.out.println(salarie.getStatut());
		System.out.println(pigiste.getStatut());
		
		salarie.afficherDonnes();
		pigiste.afficherDonnes();
	}

}
