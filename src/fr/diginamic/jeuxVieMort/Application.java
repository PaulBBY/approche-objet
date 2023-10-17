package fr.diginamic.jeuxVieMort;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Cellule> laVie = ParametreVie.parametreVie(scanner);
		
		
	}

}
