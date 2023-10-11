package fr.diginamic.jdr;

import java.util.Random;

public abstract class Entite {
	
	protected int force;
	protected int pdv;
	
	static Random r =new Random();

	public Entite(int force, int pdv) {

		this.force = force;
		this.pdv = pdv;
	}
	
	public abstract int score();

	public final int attaque() {
		return force+(r.nextInt(1,11));
	}
	

	public int getForce() {
		return force;
	}


	public void setForce(int force) {
		this.force = force;
	}


	public int getPdv() {
		return pdv;
	}


	public void setPdv(int pdv) {
		this.pdv = pdv;
	}

}
