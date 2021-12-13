package fr.diginamic.salaire;

public class Pigiste extends Intervenant{
	
	public final String NOM_STATUS = "pigiste";
	
	private int nbJoursTravailles;
	private int montantJournalier;
	
	public Pigiste(String nom, String prenom, int nbJoursTravailles, int montantJournalier) {
		super(nom, prenom);
		this.nbJoursTravailles = nbJoursTravailles;
		this.montantJournalier = montantJournalier;
	}

	public double getSalaire() {
		return nbJoursTravailles*montantJournalier;
	}
	
	public String getStatut() {
		return NOM_STATUS;
	}
}
