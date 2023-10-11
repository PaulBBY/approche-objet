package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CompteTaux compte1 = new CompteTaux("abcd", 12.0, 3.0);
		Compte compte2 = new Compte("abcd", 12.0);
		
		Compte[] comptes = new Compte[2];
		
		comptes[0] = compte2;
		comptes[1] = compte1;
		
		for(Compte i: comptes) {
			System.out.println(i.toString());
		}
	
	}

}
