package fr.diginamic.banque.entites;

public class Compte {

	private String numeroCompte;
	private double soldeCompte;
	
	public Compte(String numeroCompte, double soldeCompte) {
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCompte;
	}

	public String toString() {
		return "Compte [numeroCompte=" + numeroCompte + ", soldeCompte=" + soldeCompte + "]";
	}



	public String getNumeroCompte() {
		return numeroCompte;
	}

	public double getSoldeCompte() {
		return soldeCompte;
	}

}
