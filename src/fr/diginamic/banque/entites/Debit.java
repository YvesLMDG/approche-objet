package fr.diginamic.banque.entites;

public class Debit extends Operation {

	final String TYPE = "DEBIT";
	
	public Debit(String date, Integer montant) {
		super(date, montant);
	}

	public String getType() {
		return TYPE;
	}
	
	public int execute(int solde) {
		return solde - super.montant;
	}
}
