package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import listes.Ville;

public class MapVilles {

	public static void main(String[] args) {
		Map<String, Integer> mapVilles = new HashMap<>();
		mapVilles.put("Nice", 343_000);
		mapVilles.put("Carcassonne", 47_000);	
		mapVilles.put("Narbonne", 53_400);	
		mapVilles.put("Lyon", 484_000);
		mapVilles.put("Foix", 9_700);
		mapVilles.put("Pau", 77_200);
		mapVilles.put("Marseille", 850_700);
		mapVilles.put("Tarbes", 40_600);
		
		String villeMinHabs = "";
		int nbMinHabs = Integer.MAX_VALUE;
		
		for (String ville: mapVilles.keySet()) {
			if(mapVilles.get(ville)<nbMinHabs) {
				villeMinHabs = ville;
			}
		}
		mapVilles.remove(villeMinHabs);
		
		for (String ville: mapVilles.keySet()) {
			System.out.println("Clé : " + ville + " Valeur : " + mapVilles.get(ville));
		}
	}

}
