package fr.diginamic.testenumeration;

public enum Saison {
	
	PRINTEMPS("Printemps",1),
	ETE("Eté", 2),
	AUTOMNE("Automne", 3),
	HIVER("Hiver", 4);
	
	private String libelle;
	private int ordre;
	
	private Saison(String libelle, int ordre) {
		this.libelle = libelle;
		this.ordre = ordre;
	}

	public String getLibelle() {
		return libelle;
	}

	public int getOrdre() {
		return ordre;
	}
	
	public static Saison getSaison(String libelle) {
		for (Saison s : Saison.values()) {
			if(s.getLibelle().equals(libelle)) {
				return s;
			}
		}
		return null;
	}
}
