package fr.diginamic.maison;

public class Maison {
	
	
	private Piece[] pieces;
	private int nbPieces;
	
	public Maison(int nbPiecesMax) {
		pieces = new Piece[nbPiecesMax];
	}
	
	public void ajouterPiece(Piece piece) {
		if(nbPieces < pieces.length) {
			pieces[nbPieces]=piece;
		}
		nbPieces++;
	}
	
	public double getSuperficieTotale(){
		double superficieTotale = 0;
		for (int i=0; i<nbPieces; i++) {
			superficieTotale += pieces[i].getSuperficie();
		}
		return superficieTotale;
	}
	
	public double getSuperficieParEtage(int etage){
		double superficieParEtage = 0;
		for (int i=0; i<nbPieces; i++) {
			if(pieces[i].getEtage() == etage) {
				superficieParEtage += pieces[i].getSuperficie();
			}
		}
		return superficieParEtage;
	}
	
}
