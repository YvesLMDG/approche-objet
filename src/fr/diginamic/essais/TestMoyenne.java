package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		
		CalculMoyenne calculMoyenne1 = new CalculMoyenne();
		
		for (int i=0; i<101; i++) {
			calculMoyenne1.ajout(i);
		}

		CalculMoyenne calculMoyenne2 = new CalculMoyenne();
		
		for (int i=0; i<100; i++) {
			calculMoyenne2.ajout(2);
		}
		
		System.out.println("Test de CalculMoyenne.calcul()");
		System.out.println("Moyenne des nombres de 0 à 100 : " + calculMoyenne1.calcul());
		System.out.println("Moyenne de 100 nombres tous égales à 2 : " + calculMoyenne2.calcul());

	}

}
