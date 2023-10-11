package fr.diginamic.maison;

public class TestMaison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maison maison = new Maison();
		
		

		
		Piece sdbE1 = new SalleDebain(10.0, 1);
		Piece wcE1 = new WC(9.0,1);
		Piece chambre1E1 = new Chambre(12.0,1);
		Piece chambre2E1 = new Chambre(10.0,1);
		Piece cuisineRDC = new Cuisine(24.0,0);
		Piece salonRDC = new Salon(32.0,0);
		Piece wcRDC = new WC(12.0, 0);
		Piece sdbRDC = new SalleDebain(13.0, 0);
		Piece chambreRDC = new Chambre(9.0, 0);
	
		
		maison.ajouterPiece(sdbE1);
		maison.ajouterPiece(wcRDC);
		maison.ajouterPiece(sdbRDC);
	

		System.out.println(maison.superficieTypePiece("SalleDebain"));
		
		System.out.println(maison.nombreTypePiece("SalleDebain"));
		
		
	
	}

}
