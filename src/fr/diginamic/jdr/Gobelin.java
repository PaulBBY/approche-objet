package fr.diginamic.jdr;

public class Gobelin extends Entite {
	
	public Gobelin() {
		super(r.nextInt(5, 11) ,r.nextInt(10, 16));
		// TODO Auto-generated constructor stub
	}

	public int score() {
		// TODO Auto-generated method stub
		return 2;
	}


}
