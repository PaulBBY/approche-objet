package entites;

public class Theatre {
	
	String nom;
	int capaMax;
	public int clientsTotal=0;
	public double recette=0;
	
	public void inscrire(int clients, double prix) {
		if (clients + clientsTotal <= capaMax) {
			clientsTotal+=clients;
			recette=clientsTotal*prix;
		} else {
			System.err.println("Capacité max atteinte");
		}
	}

	public Theatre(String nom, int capaMax) {
		super();
		this.nom = nom;
		this.capaMax = capaMax;
	}
	
	

}
