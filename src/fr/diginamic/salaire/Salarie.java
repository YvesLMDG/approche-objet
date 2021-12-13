package fr.diginamic.salaire;

public class Salarie extends Intervenant{

	public final String NOM_STATUS = "salarié";
	
	public double salaire;

	public Salarie(String nom, String prenom, double salaire) {
		super(nom, prenom);
		this.salaire = salaire;
	}

	public double getSalaire() {
		return salaire;
	}
	
	public String getStatut() {
		return NOM_STATUS;
	}
}
