package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Forme;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {
		Forme[] formes = new Forme[3];
		formes[0] = new Cercle(3);
		formes[1] = new Rectangle(2, 3);
		formes[2] = new Carre(5);
		
		for (int i=0; i<formes.length; i++) {
			AffichageForme.afficher(formes[i]);
		}
	}

}
