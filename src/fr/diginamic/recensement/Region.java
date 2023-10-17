package fr.diginamic.recensement;

import java.util.Scanner;

public class Region  {

	private String codeRegion;
	private String nomRegion;
	private String codeDepartement;
	private long populationRegion;
	
	public Region(String codeRegion, String nomRegion, String codeDepartement, long populationRegion) {
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.populationRegion = populationRegion;
	}
	

	@Override
	public String toString() {
		return "Region [codeRegion=" + codeRegion + ", nomRegion=" + nomRegion + ", codeDepartement=" + codeDepartement
				+ ", populatioRegion=" + populationRegion + "]";
	}


	public String getCodeRegion() {
		return codeRegion;
	}


	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}


	public String getNomRegion() {
		return nomRegion;
	}


	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}


	public String getCodeDepartement() {
		return codeDepartement;
	}


	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}


	public long getPopulatioRegion() {
		return populationRegion;
	}


	public void setPopulatioRegion(long populatioRegion) {
		this.populationRegion = populatioRegion;
	}

}
