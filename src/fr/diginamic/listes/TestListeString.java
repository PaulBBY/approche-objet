package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> listString = new ArrayList<>(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));
		
		int taille=0;
		int index=0;
		
		for(String s: listString) {
			if(s.length()>=taille) {
				taille=s.length();
				index=listString.indexOf(s);
			}
		}
		
		System.out.println("Le mot le plus long est : "+listString.get(index));
		
		
		
		for(int i=0; i<listString.size();i++) {
			listString.set(i, listString.get(i).toUpperCase());
		}
		
		for(String s: listString) {
			System.out.println(s);
		
		}
		
		System.out.println("---------");
		
		Iterator<String> iterator = listString.iterator();
		
		while (iterator.hasNext()) {
			String s = iterator.next();
			if (s.indexOf("N")==0) {
				iterator.remove();
			}
			
		}
		
		for(String s: listString) {
			System.out.println(s);
		
		}
		
		
		
	}

}
