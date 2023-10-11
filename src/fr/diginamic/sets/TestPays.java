package fr.diginamic.sets;

import java.util.Arrays;
import java.util.HashSet;

public class TestPays {
	
	
	public static Pays genPays(String nom, long hb, double pib) {
		return new Pays(nom, hb, pib);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			HashSet<Pays> set = new HashSet<>(Arrays.asList(genPays("USA", 331900000, 70248.63),
			genPays("UK", 67330000, 46510.28),
			genPays("France", 67750000, 43658.98),
			genPays("Allemagne", 83200000, 51203.55),
			genPays("Italie", 59110000, 35657.50),
			genPays("Japon", 125700000, 39312.66),
			genPays("Chine", 1412000000, 12556.33),
			genPays("Russie", 143400000, 12194.78),
			genPays("Inde", 1408000000, 2256.59)));
			
			
			double maxPib = 0;
			String paysMaxPib = null;
			
			for(Pays p: set) {
				if(p.getPibPHab()>=maxPib) {
					maxPib=p.getPibPHab();
					paysMaxPib=p.getNom();
				}

			}
			
			
			System.out.println(paysMaxPib);
			
			
			System.out.println("-----------");
			
			double pibMax=0;
			String paysPibMax = null;
			
			
			for(Pays p: set) {
				double pibL = p.getPibPHab()*p.getNbHab();
				if(pibL>=pibMax) {
					pibMax=pibL;
					paysPibMax=p.getNom();
				}

			}
			
			System.out.println(paysPibMax);
			
			System.out.println("-----------");
			
			
			double pibMin=pibMax;
			String paysPibMin = null;
			
			for(Pays p: set) {
				double pibL = p.getPibPHab()*p.getNbHab();
				if(pibL<pibMin) {
					pibMin=pibL;
					paysPibMin=p.getNom();
				}

			}
			
			set.remove(paysPibMin);
			
			for(Pays p: set) {
				double pibL = p.getPibPHab()*p.getNbHab();
				System.out.println(p.getNom()+" "+p.getNbHab()+" "+pibL);
			}
			
			
			

	
	}
}
