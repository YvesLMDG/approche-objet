package fr.diginamic.banque.entites;

public class Credit extends Operation {
	
	final String TYPE = "CREDIT";
	
	public Credit(String date, Integer montant) {
		super(date, montant);
	}
	
	public String getType() {
		return TYPE;
	}
	
	public int execute(int solde) {
		return solde + super.montant;
	}
}
