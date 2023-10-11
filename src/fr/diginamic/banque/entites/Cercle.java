package fr.diginamic.banque.entites;

public class Cercle {
	
	private double rayon;
	private final double pi = Math.PI;
	
	double perimetre() {
		return 2*pi*rayon;
	}
	
	double surface() {
		return pi*(this.rayon*rayon);
	}

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	
	@Override
	public String toString() {
		return "Cercle [perimetre()=" + perimetre() + ", surface()=" + surface() + "]";
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

}
