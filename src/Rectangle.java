public class Rectangle implements ObjetGeometrique {
	
	private double longueur;
	private double largeur;
	
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public double perimetre() {
		return 2*(longueur+largeur);
	}

	public double surface() {
		return longueur*largeur;
	}

	public String toString() {
		return "rectangle de longueur : " + longueur + " et de largeur : " + largeur;
	}
	
}
