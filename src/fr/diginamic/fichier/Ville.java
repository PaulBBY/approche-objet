package fr.diginamic.fichier;

public class Ville {
	
	private String nom;
	private String codeDepartement;
	private String nomRegion;
	private String nbHb;
	
	public Ville(String nom, String codeDepartement, String nomRegion, String nbHb) {
		this.nom = nom;
		this.codeDepartement = codeDepartement;
		this.nomRegion = nomRegion;
		this.nbHb = nbHb;
	}
	

	public Ville() {
		
	}

	

	@Override
	public String toString() {
		return "Ville [getNom()=" + getNom() + ", getCodeDepartement()=" + getCodeDepartement() + ", getNomRegion()="
				+ getNomRegion() + ", getNbHb()=" + getNbHb() + "]";
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public String getNbHb() {
		return nbHb;
	}

	public void setNbHb(String nbHb) {
		this.nbHb = nbHb;
	}

}
