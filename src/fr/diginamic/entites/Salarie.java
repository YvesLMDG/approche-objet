package fr.diginamic.entites;

public class Salarie {

	private String nom;
	private String prenom;
	private double salaire;
	
	public Salarie(String nom, String prenom, double salaire) {
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}
	
	public String toString() {
		return "nom : " + nom + " | prenom : " + prenom + " | salaire : " + salaire;
	}
}
