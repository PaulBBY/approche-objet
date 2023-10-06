package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale adresse1 = new AdressePostale();
		AdressePostale adresse2 = new AdressePostale();
		
		adresse1.numeroDeRue=42;
		adresse1.codePostal=31000;
		adresse1.libelleDeLaRue="Rue de la rue";
		adresse1.ville="RueVille";
		
		adresse2.numeroDeRue=23;
		adresse2.codePostal=64000;
		adresse2.libelleDeLaRue="Rue des deux rues";
		adresse2.ville="AlléeVille";
		
		
	}

}
