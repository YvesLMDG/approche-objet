package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {

	public static void afficher(Forme forme) {
		System.out.print("périmètre : " + forme.calculerPerimetre());
		System.out.print(" surface : " + forme.calculerSurface() + "\n");
	}

}
