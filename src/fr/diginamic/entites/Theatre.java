package fr.diginamic.entites;

public class Theatre {

	private String nom;
	private int jauge;
	private int nbClientsInscrits;
	private int recetteTotale;

	public Theatre(String nom, int jauge) {
		this.nom = nom;
		this.jauge = jauge;
		this.nbClientsInscrits = 0;
		this.recetteTotale = 0;
	}

	public void inscrire(int nbClients, double prix) {
		boolean plein = false;
		while(nbClients>0 && !plein) {
			plein = inscrireUnClient(prix);
			nbClients--;
		}
	}

	private boolean inscrireUnClient(double prix) {
		if(this.nbClientsInscrits>this.jauge-1) {
			System.err.println("Jauge atteinte, impossible d'inscrire de nouveaux spectateurs.");
			return true;
		}
		else {
			this.nbClientsInscrits++;
			this.recetteTotale += prix;
			return false;
		}
	}

	public String toString() {
		String message = "Le fabuleux théatre \"" + this.nom + "\" acueille ce soir ";
		message += this.nbClientsInscrits+ "/"+ this.jauge + " spectateur(s) pour une recette de ";
		message += this.recetteTotale + " euros.";

		return message;
	}

}
