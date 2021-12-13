package fr.diginamic.formes;

public class Rectangle extends Forme {
	
	private double longueur;
	private double largeur;

	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public double calculerPerimetre() {
		return 2*(longueur+largeur);
	}
	
	public double calculerSurface() {
		return longueur*largeur;
	}
	
}
