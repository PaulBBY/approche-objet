package fr.diginamic.jeuxVieMort;

public class Cellule {

	
	private int x;
	private int y;
	private int nbVoisins;
	private Boolean vivante=false;
	
	public Cellule(int x, int y, int nbVoisins, Boolean vivante) {
		this.x = x;
		this.y = y;
		this.nbVoisins = nbVoisins;
		this.vivante = vivante;
	}
	
	

	@Override
	public String toString() {
		return "Cellule [x=" + x + ", y=" + y + ", nbVoisins=" + nbVoisins + ", vivante=" + vivante + "]";
	}



	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getNbVoisins() {
		return nbVoisins;
	}

	public void setNbVoisins(int nbVoisins) {
		this.nbVoisins = nbVoisins;
	}

	public Boolean getVivante() {
		return vivante;
	}

	public void setVivante(Boolean vivante) {
		this.vivante = vivante;
	}
	
	
	
	
}
