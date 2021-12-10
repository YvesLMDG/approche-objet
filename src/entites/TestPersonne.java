package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		Personne personne1 = new Personne("nom1", "prenom1", new AdressePostale(4, "rue Edith Piaf", 44800, "Saint Herblain"));
		Personne personne2 = new Personne("nom2", "prenom2", new AdressePostale(1, "Place du Cirque", 44000, "Nantes"));

		Personne personne3 = new Personne("nom3", "prenom3", new AdressePostale(2, "Place du Commerce", 44000, "Nantes"));
		personne3.setAdressePostale(new AdressePostale(2, "Place Viarme", 44800, "Nantes"));
	}

}
