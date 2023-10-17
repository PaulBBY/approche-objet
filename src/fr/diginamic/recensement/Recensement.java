package fr.diginamic.recensement;
import java.util.ArrayList;

public class Recensement  {
	
	private ArrayList<Ville> recensement = new ArrayList<>();
	
	public Recensement(ArrayList<Ville> recensement) {
		this.recensement = recensement;
	}

	public ArrayList<Ville> getRecensement() {
		return recensement;
	}

	public void setRecensement(ArrayList<Ville> recensement) {
		this.recensement = recensement;
	}
	
}
