package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		Personne personne1 = new Personne();
		personne1.nom = "nom1";
		personne1.prenom = "prénom1";
		personne1.adressePostale = new AdressePostale();
		personne1.adressePostale.numeroRue = 4;
		personne1.adressePostale.libelleRue = "rue Edith Piaf";
		personne1.adressePostale.codePostal = 44800;
		personne1.adressePostale.nomVille = "Saint Herblain";
		
		Personne personne2 = new Personne();
		personne2.nom = "nom2";
		personne2.prenom = "prénom2";
		personne2.adressePostale = new AdressePostale();
		personne2.adressePostale.numeroRue = 1;
		personne2.adressePostale.libelleRue = "place du cirque";
		personne2.adressePostale.codePostal = 44000;
		personne2.adressePostale.nomVille = "Nantes";

	}

}
