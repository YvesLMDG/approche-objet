package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.Wc;

public class TestMaison {

	public static void main(String[] args) {
		
		Maison maMaison = new Maison(10);
		
		maMaison.ajouterPiece(new Salon(25,0));
		maMaison.ajouterPiece(new Cuisine(22,0));
		maMaison.ajouterPiece(new Wc(3,0));
		maMaison.ajouterPiece(new Chambre(17,1));
		maMaison.ajouterPiece(new Chambre(15,1));
		maMaison.ajouterPiece(new SalleDeBain(15,1));
		maMaison.ajouterPiece(new Wc(3,1));
		
		System.out.println("Superficie totale de la maison : " + maMaison.getSuperficieTotale());
		System.out.println("Superficie du rez de chaussé de la maison : " + maMaison.getSuperficieParEtage(0));
		System.out.println("Superficie du 1er étage de la maison : " + maMaison.getSuperficieParEtage(1));
	}

}
