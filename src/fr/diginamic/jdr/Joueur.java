package fr.diginamic.jdr;

import java.util.Random;

public class Joueur extends Entite {
	
	protected double score;

	public Joueur() {
		super(r.nextInt(12,19), r.nextInt(20,51));
		// TODO Auto-generated constructor stub
		this.score=0;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public int score() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
