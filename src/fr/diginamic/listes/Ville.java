package fr.diginamic.listes;

public class Ville implements Comparable<Ville>{

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

	@Override
	/*public int compareTo(Ville autre) {
		// TODO Auto-generated method stub
		if (this.habitants > autre.getHabitants()){
			return 1;
			}
			if (this.habitants < autre.getHabitants()){
			return -1;
			}
			return 0;*/
	
	public int compareTo(Ville autre) {
		return this.nom.compareTo(autre.getNom());
	}


	
	
	
}
