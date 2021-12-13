package fr.diginamic.essais;

import fr.diginamic.salaire.Intervenant;
import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		Intervenant salarie = new Salarie("Bond", "James", 1_500_000);
		Intervenant pigiste = new Pigiste("Pige", "Jean", 15, 50);
		
		salarie.afficherDonnees();
		pigiste.afficherDonnees();
		
	}

}
