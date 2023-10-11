package fr.diginamic.sets;

public class Pays {
	
	String nom;
	long nbHab;
	double pibPHab;
	
	public Pays(String nom, long nbHab, double pibPHab) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
		this.pibPHab = pibPHab;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public long getNbHab() {
		return nbHab;
	}

	public void setNbHab(long nbHab) {
		this.nbHab = nbHab;
	}

	public double getPibPHab() {
		return pibPHab;
	}

	public void setPibPHab(double pibPHab) {
		this.pibPHab = pibPHab;
	}
	
	
	

}
