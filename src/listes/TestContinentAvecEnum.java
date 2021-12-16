package listes;

import java.util.ArrayList;
import java.util.List;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		List<Ville> lVilles = new ArrayList<>();
		lVilles.add(new Ville("Nice", 343_000, Continent.EUROPE));
		lVilles.add(new Ville("Carcassonne", 47_000, Continent.EUROPE));
		lVilles.add(new Ville("Narbonne", 53_400, Continent.EUROPE));
		lVilles.add(new Ville("Lyon", 484_000, Continent.EUROPE));
		lVilles.add(new Ville("Foix", 9_700, Continent.EUROPE));
		lVilles.add(new Ville("Pau", 77_200, Continent.EUROPE));
		lVilles.add(new Ville("Marseille", 850_700, Continent.EUROPE));
		lVilles.add(new Ville("Tarbes", 40_600, Continent.EUROPE));
		
		for (Ville v: lVilles) {
			System.out.println(v);
		}
		
	}

}
