package fr.diginamic.banque.entites;

import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cercle cercle1 = CercleFactory.cercleFactory(4.0);
		Cercle cercle2 = CercleFactory.cercleFactory(7.0);
		
		
		System.out.println(cercle1+"\n"+cercle2);
		
		
	}

}
