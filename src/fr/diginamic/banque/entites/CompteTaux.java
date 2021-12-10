package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{
	
	private Integer taux;
	
	public CompteTaux(int numeroCompte, int soldeCompte, int taux) {
		super(numeroCompte, soldeCompte);
		this.taux = taux;
	}
	
	public String toString() {
		return super.toString() + ", taux : " + this.taux;
	}
	
}
