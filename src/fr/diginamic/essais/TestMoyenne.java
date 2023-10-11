package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		
		CalculMoyenne calculM = new CalculMoyenne();
		
		calculM.ajout(2);
		calculM.ajout(12);

		calculM.calcul();
		
	}

}
