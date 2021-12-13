package fr.diginamic.operations;

public class Operations {
	
	public static Double calcul(double a, double b, char operateur) {
		Double result = null;
		
		switch (operateur) {
		case '+':
			result = a+b;
			break;
		case '-':
			result = a-b;
			break;
		case '*':
			result = a*b;
			break;
		case '/':
			result = a/b;
			break;
		}
		
		return result;
	}
	
}
