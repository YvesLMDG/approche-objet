package fr.diginamic.operations;

public class CalculMoyenne {

	public static final int TAILLE_INITIALE = 10;
	
	private int tailleTab;
	private int nbElements;
	private double[] tabDouble;
	
	public CalculMoyenne() {
		this.nbElements = 0;
		this.tailleTab = TAILLE_INITIALE;
		this.tabDouble = new double[TAILLE_INITIALE];
	}
	
	public void ajout(double a) {
		if(nbElements>tailleTab-1) {
			this.agrandirTableau();	
		}
		tabDouble[nbElements] = a;
		nbElements++;
	}

	public double calcul() {
		double total = 0;
		for (int i=0; i<nbElements; i++) {
			total += tabDouble[i];
		}
		return total/nbElements;
	}
	
	private void agrandirTableau() {
		double[] nouveauTableau = new double[tailleTab+TAILLE_INITIALE];
		for (int i=0; i<tabDouble.length; i++) {
			nouveauTableau[i] = tabDouble[i];
		}
		this.tailleTab += TAILLE_INITIALE;
		tabDouble = nouveauTableau;
	}
	
}
