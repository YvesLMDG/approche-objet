package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestSetString {

	public static void main(String[] args) {
		Set<String> setPays = new HashSet<>();
		Collections.addAll(setPays, "USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde");
		//Recherche de la ville avec le plus grand nombre de lettres

		String paysMaxNbLettres = "";
		for(String pays: setPays) {
			if(pays.length()>paysMaxNbLettres.length()) {
				paysMaxNbLettres = pays;
			}
		}
		setPays.remove(paysMaxNbLettres);

		for(String pays: setPays) {
			System.out.print(pays + " ");
		}
	}
	
}


