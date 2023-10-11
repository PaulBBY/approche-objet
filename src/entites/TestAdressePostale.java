package entites;

public class TestAdressePostale {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AdressePostale adresse1 = new AdressePostale(100, "Une rue de Toulouse", 31000, "Toulouse");
		AdressePostale adresse2 = new AdressePostale(100, "Une autre rue de Toulouse", 31001, "Ville Rose");
		
		System.out.println(adresse1.ville);
		System.out.println(adresse2.ville);
		
	}

}
