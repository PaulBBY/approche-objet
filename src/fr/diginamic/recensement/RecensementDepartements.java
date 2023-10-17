package fr.diginamic.recensement;

import java.util.ArrayList;

public class RecensementDepartements {
	
	private ArrayList<Departement> recensementDepartements = new ArrayList<>();

	public RecensementDepartements(ArrayList<Departement> recensementDepartements) {
		this.recensementDepartements = recensementDepartements;
	}
	
	
	
	public ArrayList<Departement> getRecensementDepartement() {
		return recensementDepartements;
	}

	public void setRecensementDepartement(ArrayList<Departement> recensementDepartement) {
		this.recensementDepartements = recensementDepartement;
	}

}
