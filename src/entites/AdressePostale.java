package entites;

public class AdressePostale {
	
	Integer numeroRue;
	String libelleRue;
	Integer codePostal;
	String nomVille;
	
	public AdressePostale(int numeroRue, String libelleRue, int codePostal, String nomVille) {
		this.numeroRue = numeroRue;
		this.libelleRue = libelleRue;
		this.codePostal = codePostal;
		this.nomVille = nomVille;
	}
	
}
