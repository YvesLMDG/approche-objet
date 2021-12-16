package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ville implements Comparable<Ville>{

	private String nom;
	private int nbHabitants;
	private Continent continent;

	public Ville(String nom, int nbHabitants, Continent contient) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.continent = contient;
	}
	
	public int compareTo(Ville autre) {
		if (this.nbHabitants > autre.getNbHabitants()) {
			return 1;
		}
		if (this.nbHabitants < autre.getNbHabitants()) {
			return -1;
		}

		return 0;
	}

	@Override
	public boolean equals(Object autre) {
		if(autre == null || !(autre instanceof Ville) || !this.nom.equals(((Ville)autre).getNom()) || this.nbHabitants != ((Ville)autre).getNbHabitants()) {
			return false;
		}
		if(!this.continent.equals(((Ville)autre).getContinent())) {
			return false;
		}
		return true;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nom).append(" : " ).append(nbHabitants).append(" hab., " ).append(continent.getLibelle());
		return sb.toString();
	}

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

		Ville villeMaxHabs = lVilles.get(0);
		Ville villeMinHabs = lVilles.get(0);
		for (Ville v: lVilles) {
			if(v.compareTo(villeMaxHabs)>0) {
				villeMaxHabs = v;
			}
			if(v.compareTo(villeMinHabs)<0) {
				villeMinHabs = v;
			}
		}
		System.out.println("Ville la plus peuplée => " + villeMaxHabs);

		lVilles.remove(villeMinHabs);

		Iterator<Ville> it = lVilles.iterator();
		while(it.hasNext()) {
			Ville v = it.next();
			if(v.getNbHabitants()>100_000) {
				v.setNom(v.getNom().toUpperCase());
			}
		}
		System.out.println("\nVilles de la liste : ");
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

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

}
