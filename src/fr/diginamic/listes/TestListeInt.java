package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestListeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> listInt = new ArrayList<>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));
			
		for(Integer i: listInt) {
			System.out.println(i);
		}
		
		System.out.println(listInt.size());
		
		int max = 0;
		for(Integer i: listInt) {
			if(i>=max) {
				max=i;
			}
		}
		
		System.out.println("Le max de la liste est : "+max);
		
		int min =0;
		for(Integer i: listInt) {
			if(i<=min) {
				min=i;
			}
		}
		
		while(listInt.contains(min)) {
			listInt.remove(listInt.indexOf(min));
		}
		
		
		Iterator<Integer> iterator = listInt.iterator();
		
		while (iterator.hasNext()) {
			Integer i = iterator.next();
			if (i < 0) {
				iterator.remove();
			}
			
		}
		
		for(Integer i: listInt) {
			System.out.println(i);
		}
		
	}

}
