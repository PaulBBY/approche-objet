package fr.diginamic.maps;

public class Pays {

	String nom;
	long nbHb;
	String continent;
	
	public Pays(String nom, long nbHb, String continent) {
		super();
		this.nom = nom;
		this.nbHb = nbHb;
		this.continent = continent;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public long getNbHb() {
		return nbHb;
	}
	public void setNbHb(long nbHb) {
		this.nbHb = nbHb;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	
	
	
}
