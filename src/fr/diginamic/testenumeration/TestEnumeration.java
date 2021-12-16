package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		
		for(Saison s: Saison .values()) {
			System.out.print(String.format("%s ",s.getLibelle()));
		}
		
		String nom = "ETE";
		System.out.println(String.format("\n%s", Saison.valueOf(nom).getLibelle()));
		
		String libelle = "Hiver";
		Saison s1 = Saison.getSaison(libelle);
		System.out.println(s1);
		
		String libelleErr = "Pas_une_saison";
		Saison s2 = Saison.getSaison(libelleErr);
		System.out.println(s2);
		
	}

}
