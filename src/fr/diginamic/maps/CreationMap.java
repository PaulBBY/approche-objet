package fr.diginamic.maps;

import java.util.HashMap;

public class CreationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		HashMap<String, Integer> salaries = new HashMap<>();
		
		salaries.put("Paul", 1750);
		salaries.put("Hicham", 1825);
		salaries.put("Yu", 2250);
		salaries.put("Ingrid", 2015);
		salaries.put("Chantal", 2418);
		
		System.out.println(salaries.size());		
		
	}

}
