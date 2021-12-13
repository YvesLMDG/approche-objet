package fr.diginamic.salaire;

public abstract class Intervenant {

	private String nom;
	private String prenom;

	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public abstract double getSalaire();
	public abstract String getStatut();
	
	public void afficherDonnees() {
		System.out.print("nom : " + nom + " | prenom : " + prenom);
		System.out.print(" | salaire : " + getSalaire() + " | statut : " + getStatut() + "\n");
	}
	
}
