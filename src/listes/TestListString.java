package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestListString {

	public static void main(String[] args) {
		
		List<String> villes = new ArrayList<>(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));
		
		//Recherche de la ville avec le plus grand nombre de lettres
		String villeMaxNbLettres = "";
		for(String ville: villes) {
			if(ville.length()>villeMaxNbLettres.length()) {
				villeMaxNbLettres = ville;
			}
		}
		System.out.println("Ville ayant le plus grand nombre de lettres : " + villeMaxNbLettres);
		
		//Villes en majuscules
		for(int i=0;i<villes.size(); i++) {
			villes.set(i, villes.get(i).toUpperCase());
		}
		
		//Affichage
		for(String v: villes) {
			System.out.print(v + " ");
		}
		
	}

}
