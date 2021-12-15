package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		Map<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");

		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");

		Iterator <Integer> keysIt = mapVilles.keySet().iterator();
		System.out.print("Clés : ");
		while(keysIt.hasNext()) {
			System.out.print(keysIt.next() + " ");
		}

		Iterator <String> valuesIt = mapVilles.values().iterator();
		System.out.print("\nValeurs : ");
		while (valuesIt.hasNext()) {
			System.out.print(valuesIt.next() + " ");

		}
		
		System.out.println("Taille mapVilles : " + mapVilles.size());

	}

}
