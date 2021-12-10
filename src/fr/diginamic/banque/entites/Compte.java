package fr.diginamic.banque.entites;

public class Compte {
	
	private int numeroCompte;
	private int soldeCompte;
	
	public Compte(int numeroCompte, int soldeCompte) {
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCompte;
	}
	
	public String toString() {
		return "numeroCompte : " + numeroCompte + ", soldeCompte : "+ soldeCompte;
	}
	
	public void executeOperation(Operation operation) {
		this.soldeCompte = operation.execute(this.soldeCompte);
	}
	
}
