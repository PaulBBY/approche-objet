package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;


public class TestVilles {

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
	
	int taille=0;
	
	String ville="";
	
	for(Ville v: mesVilles) {
		if(v.getHabitants()>=taille) {
			taille=v.getHabitants();
			ville=v.getNom();
		}
	}
	System.out.println(ville);
	
	int min=0;
	int indexMin=0;
	
	for(Ville v:mesVilles) {
		if(v.getHabitants()<=min) {
			indexMin=mesVilles.indexOf(min);
		}
	}
	
	mesVilles.remove(min);
	
	for(Ville v:mesVilles) {
		if(v.getHabitants()>100000) {
			v.setNom(v.getNom().toUpperCase());
		}
		
	}
	
	for(Ville v: mesVilles) {
		System.out.println(v.getNom()+" : "+v.getHabitants());
	}
	
	
	}
	
	
	

}
