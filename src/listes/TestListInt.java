package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestListInt {

	public static void main(String[] args) {

		List<Integer> liste = new ArrayList<>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));

		for (Integer i: liste) {
			System.out.print(i + " ");
		}
		System.out.println("\nTaille de la liste : " + liste.size());

		//Affichage du plus grand élément
		int max = liste.get(0);
		for (Integer i: liste) {
			if(i>max) {
				max = i;
			}
		}
		System.out.println("Element max : " + max);

		//Suppression du plus petit élément
		int min = liste.get(0);
		for (Integer i: liste) {
			if (i<min) {
				min=i;
			}
		}
		Iterator<Integer> it = liste.iterator();
		while(it.hasNext()) {
			if(it.next() == min) {
				it.remove();
			}
		}

		for (Integer i: liste) {
			System.out.print(i + " ");
		}
		System.out.print("\n");

		// Inverser les éléments négatifs
		for (int i=0; i<liste.size(); i++) {
			int nb = liste.get(i);
			if(nb<0) {
				liste.set(i, -nb);
			}
		}
		for (Integer i: liste) {
			System.out.print(i + " ");
		}
	}

}

