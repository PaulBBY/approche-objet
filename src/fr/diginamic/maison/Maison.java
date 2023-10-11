package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {

	Piece[] pieces = new Piece[0];
	
	public void ajouterPiece(Piece piece) {
		
		
		if (piece!= null && piece.getEtage() >= 0 && piece.getSuperficie()>=0 ) {
			pieces= Arrays.copyOf(pieces, pieces.length+1);
			pieces[pieces.length-1]=piece;
		} else{
			System.err.println("Valeur incohérente");
		}
		
	
	}
	public double superficieMaison() {
		
		double superficieMaison=0;
		for(Piece piece:pieces) {
			superficieMaison+=piece.getSuperficie();
		}
		return superficieMaison;
	}
	
	public double superficieEtage(int etage) {
		double superficieEtage=0;
		for(Piece piece:pieces) {
			if(piece.getEtage()==etage) {
				superficieEtage+=piece.getSuperficie();
			}
		}
		return superficieEtage;
	}
	
	public double superficieTypePiece(String type) {
		
		double superficie = 0;
		
		switch (type) {
			case "WC":
				for(Piece piece:pieces) {
					if(piece instanceof WC) {
						superficie+=piece.getSuperficie();
					}
				}
				break;
			case "SalleDebain":
				for(Piece piece:pieces) {
					if(piece instanceof SalleDebain) {
						superficie+=piece.getSuperficie();
					}
				}
				break;
			case "Salon":
				for(Piece piece:pieces) {
					if(piece instanceof Salon) {
						superficie+=piece.getSuperficie();
					}
				}
				break;
			case "Chambre":
				for(Piece piece:pieces) {
					if(piece instanceof Chambre) {
						superficie+=piece.getSuperficie();
					}
				}
				break;
			case "Cuisine":
				for(Piece piece:pieces) {
					if(piece instanceof Cuisine) {
						superficie+=piece.getSuperficie();
					}
				}
				break;
			default:
				System.err.println("Mauvaise saisie type pièce");
		}
		
		return superficie;
	}
	
public int nombreTypePiece(String type) {
		
		int nbPieces = 0;
		
		switch (type) {
			case "WC":
				for(Piece piece:pieces) {
					if(piece instanceof WC) {
						nbPieces++;
					}
				}
				break;
			case "SalleDebain":
				for(Piece piece:pieces) {
					if(piece instanceof SalleDebain) {
						nbPieces++;
					}
				}
				break;
			case "Salon":
				for(Piece piece:pieces) {
					if(piece instanceof Salon) {
						nbPieces++;
					}
				}
				break;
			case "Chambre":
				for(Piece piece:pieces) {
					if(piece instanceof Chambre) {
						nbPieces++;
					}
				}
				break;
			case "Cuisine":
				for(Piece piece:pieces) {
					if(piece instanceof Cuisine) {
						nbPieces ++;
					}
				}
				break;
			default:
				System.err.println("Mauvaise saisie type pièce");
		}
		
		return nbPieces;
	}
}
