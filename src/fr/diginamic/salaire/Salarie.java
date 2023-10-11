package fr.diginamic.salaire;

public class Salarie extends Intervenant {

	private double salaireMensuel;

	public Salarie(String nom, String prenom, double salaireMensuel) {
		super(nom, prenom);
		this.salaireMensuel=salaireMensuel;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return salaireMensuel;
	}

	@Override
	public String getStatut() {
		// TODO Auto-generated method stub
		return "Salarie";
	}

	public double getSalaireMensuel() {
		return salaireMensuel;
	}

	public void setSalaireMensuel(double salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}
	
	

}
