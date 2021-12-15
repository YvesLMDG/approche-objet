package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FusionMap {

	public static void main(String[] args) {

		// Création map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		
		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		
		Map <Integer, String> map3 = new HashMap<>();
		Iterator <Integer> keysIt = map1.keySet().iterator();
		int key;
		while(keysIt.hasNext()) {
			key = keysIt.next();
			map3.put(key, map1.get(key));
		}
		keysIt = map2.keySet().iterator();
		while(keysIt.hasNext()) {
			key = keysIt.next();
			map3.put(key, map1.get(key));
		}
		
		keysIt = map2.keySet().iterator();
		while(keysIt.hasNext()) {
			key = keysIt.next();
			map3.put(key, map2.get(key));
		}
		
		keysIt = map3.keySet().iterator();
		while(keysIt.hasNext()) {
			key = keysIt.next();
			System.out.println("Clé : " + key + " Valeur : " + map3.get(key));
		}
		
	}

}
