	package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		Path path = Paths.get("C:\\Users\\Paul\\Documents\\7. Langage Java - approche objet\\Journée J5 & J6\\section 2 - traitement des fichiers\\recensement.csv");
		Path pathOut = Paths.get("C:\\Users\\Paul\\Documents\\7. Langage Java - approche objet\\Journée J5 & J6\\section 2 - traitement des fichiers\\recensementOut.csv");

		List<String> linesAll = Files.readAllLines(path, StandardCharsets.UTF_8);
		List<String> linesIn = new ArrayList<>();
		
		for(int i = 0; i<=99; i++) {
			linesIn.add(linesAll.get(i));
		}
		
		
		for(String s : linesIn) {
			System.out.println(s);
		}
		
		Files.write(pathOut, linesIn);
	}

}
