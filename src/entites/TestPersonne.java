package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		Personne personne1 = new Personne("nom1", "prenom1", new AdressePostale(4, "rue Edith Piaf", 44800, "Saint Herblain"));
		Personne personne2 = new Personne("nom2", "prenom2", new AdressePostale(1, "Place du Cirque", 44000, "Nantes"));

	}

}
