package fr.diginamic.formes;

public class Cercle extends Forme {
	
	private double rayon, pi = Math.PI;
	
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return 2*pi*rayon;
	}

	@Override
	public double calculerSurface() {
		// TODO Auto-generated method stub
		return pi*rayon*rayon;
	}
	
	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}













}
