package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{
	
	private double taux = 0.4;
	
	public CompteTaux(String numeroCompte, double soldeCompte, double taux) {
		super(numeroCompte, soldeCompte);
		this.taux=taux;
	}

	@Override
	public String toString() {
		return "CompteTaux [taux=" + taux + super.toString() + "]";
	}

	

}
