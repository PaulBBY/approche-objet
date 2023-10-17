package fr.diginamic.recensement;

import java.util.ArrayList;

public class RecensementRegions {

	private ArrayList<Region> recensementRegions = new ArrayList<>();

	public RecensementRegions(ArrayList<Region> recensementRegions) {
		this.recensementRegions = recensementRegions;
	}

	public ArrayList<Region> getRecensementRegions() {
		return recensementRegions;
	}

	public void setRecensementRegions(ArrayList<Region> recensementRegions) {
		this.recensementRegions = recensementRegions;
	}
	
	
}
