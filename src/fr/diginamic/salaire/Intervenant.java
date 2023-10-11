package fr.diginamic.salaire;

public abstract class Intervenant {
	
	protected String nom;
	protected String prenom;
	
	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public final void afficherDonnes() {
		System.out.println("Nom : "+nom
		+"\nPrénom : "+prenom
		+"\nSalaire : "+getSalaire()
		+"\nStatut : "+getStatut());
		
		
	}
	
	public abstract String getStatut();
	
	public abstract double getSalaire();
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
}
