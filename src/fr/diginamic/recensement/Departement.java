package fr.diginamic.recensement;

import java.util.Scanner;

public class Departement {
	
	private String codeRegion;
	private String nomRegion;
	private String codeDepartement;
	private long populationDepartement;
	
	public Departement(String codeRegion, String nomRegion, String codeDepartement, long populationDepartement) {
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.populationDepartement = populationDepartement;
	}

	@Override
	public String toString() {
		return "Departement [codeRegion=" + codeRegion + ", nomRegion=" + nomRegion + ", codeDepartement="
				+ codeDepartement + ", populationDepartement=" + populationDepartement + "]";
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

	public long getPopulationDepartement() {
		return populationDepartement;
	}

	public void setPopulationDepartement(long populationDepartement) {
		this.populationDepartement = populationDepartement;
	}
	
}
