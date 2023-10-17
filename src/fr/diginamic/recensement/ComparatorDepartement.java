package fr.diginamic.recensement;

import java.util.Comparator;

public class ComparatorDepartement implements Comparator<Departement> {

	@Override
	public int compare(Departement o1, Departement o2) {
		// TODO Auto-generated method stub
		if (o1.getPopulationDepartement()>o2.getPopulationDepartement()) {
			return 1;
		} else if (o1.getPopulationDepartement()<o2.getPopulationDepartement()) {
			return -1;
		} else {
			return 0;
		}
	}
	

}
