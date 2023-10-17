package fr.diginamic.jeuxVieMort;

import java.util.ArrayList;

public class CelluleFactory {
	
	
	static ArrayList<Cellule> cellulesMatrice() {
		
		
		ArrayList<Cellule> matriceVie = new ArrayList<>();
		
		for(int y = 0; y<=4; y++) {
			for(int x = 0; x<=9; x++) {
				matriceVie.add(cellulesFactory(x, y));
			}
		}
		
		return matriceVie;
		
	}

	static Cellule cellulesFactory(int x, int y) {
		
		return new Cellule(x,y, 0, false);
	}
}
