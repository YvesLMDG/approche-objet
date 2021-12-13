package fr.diginamic.maison;

public abstract class Piece {
	
	private double superficie;
	private int etage;
	
	public Piece(double superficie, int numEtage) {
		this.superficie = superficie;
		this.etage = numEtage;
	}
	
	public double getSuperficie() {
		return superficie;
	}
	
	public double getEtage() {
		return etage;
	}

}
