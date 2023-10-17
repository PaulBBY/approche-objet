package fr.diginamic.maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

import fr.diginamic.listes.Ville;

public class ComptagePaysParContinent {

	
	static Pays constructeur(String nom, long nbHb, String continent) {
		
		return new Pays(nom, nbHb, continent);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		
		ArrayList<Pays> pays = new ArrayList<>(Arrays.asList(constructeur("France", 65000000, "Europe"),
				constructeur("Allemagne", 80000000, "Europe"), constructeur("Belgique", 10000000, "Europe"),
				constructeur("Russine", 150000000, "Asie"), constructeur("Chine", 1400000000, "Asie"),
				constructeur("Indonésie", 220000000, "Océanie"), constructeur("Australie", 20000000, "Océanie")));
		
		HashMap<String,	Integer> paysContinents = new HashMap<String, Integer>();
		
		
	
		for(Pays p: pays) {
			if(!paysContinents.containsKey(p.getContinent())) {
				paysContinents.put(p.getContinent(), 1);
			} else {
			paysContinents.replace(p.getContinent(), paysContinents.get(p.getContinent())+1);
			}
		}
		
		
		for(String s: paysContinents.keySet())	{
			System.out.println(s);
			System.out.println(paysContinents.get(s));
		}
	}
	
	
}
