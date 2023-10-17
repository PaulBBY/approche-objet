package fr.diginamic.maps;

import java.util.HashMap;

import fr.diginamic.listes.Ville;

public class MapsVilles {

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
		
		HashMap<String, Ville> villes = new HashMap<String, Ville>();
		
		villes.put("Nice", ville1);
		villes.put("Carcasonne", ville2);
		villes.put("Narbonne", ville3);
		villes.put("Lyon", ville4);
		villes.put("Foix", ville5);
		villes.put("Pau", ville6);
		villes.put("Marseille", ville7);
		villes.put("Tarbes", ville8);
		
		String villem= null;
		int habm=99999999;
		for(Ville v: villes.values()) {
			if(v.getHabitants() <= habm) {
				 	habm=v.getHabitants();
				 	villem=v.getNom();
			}

			
		}
		
		villes.remove(villem);
		
		for(Ville v: villes.values()) {
			
			System.out.println(v.getHabitants()+ " "+v.getNom());
		}
	}
	

}
