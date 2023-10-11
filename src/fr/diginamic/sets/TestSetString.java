package fr.diginamic.sets;

import java.util.Arrays;
import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set = new HashSet<>(Arrays.asList("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));
		
		String motmax = null;
		int tailleMotMax = 0;
		
		for(String s: set) {
			if(s.length()>=tailleMotMax) {
				tailleMotMax=s.length();
				motmax=s;
			}
		}
		
		set.remove(motmax);
		
		for(String s: set) {
			System.out.println(s);
		}
	}

}
