package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;

public abstract class MenuService {
	
	public abstract void traiter(Recensement recensement, Scanner scanner) ;
	
	public abstract void top10(Recensement recensement);
	
	
}
