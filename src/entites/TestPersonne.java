package entites;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personne personne1 = new Personne();
		Personne personne2 = new Personne();
		
		personne1.nom="Baby";
		personne1.prenom="Paul";
		personne1.adresse.codePostal=31520;
		personne1.adresse.libelleDeLaRue="Une certaine rue";
		personne1.adresse.ville="Une certaine ville";
		personne1.adresse.numeroDeRue=243;
		
		personne2.nom="Baby";
		personne2.prenom="Simon";
		personne2.adresse.codePostal=332232;
		personne2.adresse.libelleDeLaRue="Un autre rue";
		personne2.adresse.ville="Toulouse";
		personne2.adresse.numeroDeRue=4345;

	}

}
