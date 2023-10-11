package fr.diginamic.listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> listInt = new ArrayList<>();
		
		
		
		for(int i = 1; i<=100; i++) {
			listInt.add(i);
		}
		
		System.out.println(listInt.size());
	}

}
