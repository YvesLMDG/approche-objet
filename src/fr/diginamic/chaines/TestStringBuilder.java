package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		long debut = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		
		for (int i=1; i<=100_000; i++){
			sb.append(i);
			sb.append("\n");
		}
		
		long fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes avec StringBuilder :" + (fin - debut));
		
		
		debut = System.currentTimeMillis();
		
		String s = "";
		for (int i=1; i<=100_000; i++){
			s += i + "\n";
		}
		
		fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes avec String et la concaténation + :" + (fin - debut));
		
	}

}
