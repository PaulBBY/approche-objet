package fr.diginamic.jeuxVieMort;

import java.util.ArrayList;

public class Generation {

	public ArrayList<Cellule> voisinsVivants(ArrayList<Cellule> ancienneGen){
		
		for(int i = 0; i<=24; i++) {
			Cellule c = ancienneGen.get(i);
			for(Cellule v : ancienneGen) {
				if(v.getVivante()==true) {
					if (v.getX()>=c.getX()-1 && v.getX()<=c.getX()+1) {
						if(v.getY()>=c.getY()-1 && v.getY()<=c.getY()+1) {
							if(v!=c) {
								ancienneGen.get(i).setNbVoisins(1+ancienneGen.get(i).getNbVoisins());;
							}
						}
					}
				}
			}
			
		}
		
		return ancienneGen;
		
	}
	
	public ArrayList<Cellule> cellulesVivantes(){
		return ;
		
	}
	
}
