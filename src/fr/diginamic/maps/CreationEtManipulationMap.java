package fr.diginamic.maps;

import java.util.HashMap;

public class CreationEtManipulationMap  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> mapVilles = new HashMap<>();
		
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(3, "Bordeaux");
		
		for(Integer i: mapVilles.keySet()) {
			System.out.println(i);
		}
		
		System.out.println("----------");
		
		for(String s: mapVilles.values()) {
			System.out.println(s);
		}
		
		System.out.println("----------");
		
		System.out.println(mapVilles.size());
		
	}

}
