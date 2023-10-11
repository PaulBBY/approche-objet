package fr.diginamic.listes;

public class Ville {

	String nom;
	int habitants;
	
	public Ville(String nom, int habitants) {
		super();
		this.nom = nom;
		this.habitants = habitants;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getHabitants() {
		return habitants;
	}

	public void setHabitants(int habitants) {
		this.habitants = habitants;
	}
	
	
}
