package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ville implements Comparable<Ville>{

	private String nom;
	private int nbHabitants;

	public Ville(String nom, int nbHabitants) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}
	/**
	public int compareTo(Ville autre) {
		if (this.nbHabitants > autre.getNbHabitants()) {
			return 1;
		}
		if (this.nbHabitants < autre.getNbHabitants()) {
			return -1;
		}

		return 0;
	}
	 **/

	public int compareTo(Ville autre) {
		return this.nom.compareTo(autre.getNom());
	}

	public String toString() {
		return nom + " : " + nbHabitants + " hab.";
	}

	public static void main(String[] args) {
		List<Ville> lVilles = new ArrayList<>();
		lVilles.add(new Ville("Nice", 343_000));
		lVilles.add(new Ville("Carcassonne", 47_000));
		lVilles.add(new Ville("Narbonne", 53_400));
		lVilles.add(new Ville("Lyon", 484_000));
		lVilles.add(new Ville("Foix", 9_700));
		lVilles.add(new Ville("Pau", 77_200));
		lVilles.add(new Ville("Marseille", 850_700));
		lVilles.add(new Ville("Tarbes", 40_600));

		Collections.sort(lVilles);

		System.out.println("Villes de la liste : ");
		for (Ville v: lVilles) {
			System.out.println(v);
		}
		
		ComparatorHabitant comparatorHab = new ComparatorHabitant();
		ComparatorNom comparatorNom = new ComparatorNom();
		
		Collections.sort(lVilles, comparatorHab);
		System.out.println("\nVilles triées avec comparatorHab: ");
		for (Ville v: lVilles) {
			System.out.println(v);
		}
		
		Collections.sort(lVilles, comparatorNom);
		System.out.println("\nVilles triées avec comparatorNom: ");
		for (Ville v: lVilles) {
			System.out.println(v);
		}
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}

}
