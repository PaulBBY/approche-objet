package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Iterator;

public class FusionMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		
		Iterator<String> itmap1 = map1.values().iterator();
		
		for(Integer i: map1.keySet()) {
			map3.put(i, map1.get(i));
		}
		

		for(Integer i: map2.keySet()) {
			map3.put(i, map2.get(i));
		}

		for(String s:map3.values()) {
			System.out.println(s);
		}
	}

}
