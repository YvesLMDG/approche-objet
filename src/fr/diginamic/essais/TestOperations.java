package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		
		System.out.println("Test de : Operations.calcul(double a, double b, char operations)");
		System.out.println("1 + 2 : "  + Operations.calcul(1, 2, '+'));
		System.out.println("1 - 2 : "  + Operations.calcul(1, 2, '-'));
		System.out.println("1 * 2 : "  + Operations.calcul(1, 2, '*'));
		System.out.println("1 / 2 : "  + Operations.calcul(1, 2, '/'));
		
	}

}
