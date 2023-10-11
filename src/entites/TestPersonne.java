package entites;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdressePostale adresse = new AdressePostale(100, "Une rue de Toulouse", 31520, "Toulouse");
		Personne personne1 = new Personne("Baby", "Paul", adresse);
		
		System.out.println(personne1.adresse.ville);
		
		
		
		

	}

}
