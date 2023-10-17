package fr.diginamic.recensement;

import java.util.Comparator;

public class ComparatorRegion implements Comparator<Region>{

	@Override
	public int compare(Region o1, Region o2) {
		// TODO Auto-generated method stub
		if (o1.getPopulatioRegion()>o2.getPopulatioRegion()) {
			return 1;
		} else if (o1.getPopulatioRegion()<o2.getPopulatioRegion()) {
			return -1;
		} else {
			return 0;
		}
	}

}
