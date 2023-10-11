package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
	
	protected double joursTravailleMois;
	protected double remunerationjour;

	public Pigiste(String nom, String prenom, double joursTravailleMois, double remunerationjour) {
		super(nom, prenom);
		this.joursTravailleMois=joursTravailleMois;
		this.remunerationjour=remunerationjour;
	}

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return joursTravailleMois*remunerationjour;
	}

	

	@Override
	public String getStatut() {
		// TODO Auto-generated method stub
		return "Pigiste";
	}

	public double getJoursTravailleMois() {
		return joursTravailleMois;
	}

	public void setJoursTravailleMois(double joursTravailleMois) {
		this.joursTravailleMois = joursTravailleMois;
	}

	public double getRemunerationjour() {
		return remunerationjour;
	}

	public void setRemunerationjour(double remunerationjour) {
		this.remunerationjour = remunerationjour;
	}


}
