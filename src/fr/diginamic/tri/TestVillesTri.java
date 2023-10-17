package fr.diginamic.tri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import fr.diginamic.listes.Ville;

public class TestVillesTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Ville ville1=new Ville("Nice",343000);
		Ville ville2=new Ville("Carcasonne",47800);
		Ville ville3=new Ville("Narbonne",53400);
		Ville ville4=new Ville("Lyon",484000);
		Ville ville5=new Ville("Foix",9700);
		Ville ville6=new Ville("Pau",77200);
		Ville ville7=new Ville("Marseille",850700);
		Ville ville8=new Ville("Tarbes",40600);
		
		ArrayList<Ville> mesVilles = new ArrayList<>(Arrays.asList(ville1,ville2,ville3,ville4,ville5,ville6,ville7,ville8));
		
		Collections.sort(mesVilles);

		for(Ville v: mesVilles) {
			System.out.println(v.getNom()+" : "+v.getHabitants());
		}
	}

}
