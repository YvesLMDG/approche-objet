package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		
		Theatre theatre1 = new Theatre("100 Noms", 1000);
		for (int i=0; i<1001; i++) {
			theatre1.inscrire(1, 20);
		}
		
		System.out.print("Test de Theatre.ajout(nbClients, prix)");
		System.out.print(" avec 1001 clients pour une jauge de 1000 et un prix à 20 euros\n");
		System.out.println(theatre1);
	}

}
