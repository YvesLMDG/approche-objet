package fr.diginamic.banque.entites;

public abstract class Operation {
	
	protected String date;
	protected int montant;

	public Operation(String date, int montant) {
		this.date = date;
		this.montant = montant;
	}
	
	public String toString() {
		return "date : " + this.date + ", montant : " + this.montant + " type : " + getType();
	}
	
	public abstract String getType();
	public abstract int execute(int solde);
}
