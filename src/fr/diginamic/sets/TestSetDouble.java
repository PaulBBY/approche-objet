package fr.diginamic.sets;

import java.util.Arrays;
import java.util.HashSet;

public class TestSetDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Double> set = new HashSet<>(Arrays.asList(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));
		
		for(Double d: set) {
			System.out.println(d);;
		}
		
		double max=0;
		for(Double d: set) {
			if(d>=max) {
				max=d;
			}
		}
		
		System.out.println("------");
		System.out.println(max);
	
		double min=0;
		for(Double d: set) {
			if(d<=min) {
				min=d;
			}
		}
		
		set.remove(min);
		
		System.out.println("------");
		for(Double d: set) {
			System.out.println(d);;
		}
		System.out.println("------");
	}

}
