package listes;

public class TestEquals {

	public static void main(String[] args) {

		Ville ville1 = new Ville("Saint Petersbourg", 4_991_000 , Continent.EUROPE);
		Ville ville2 = new Ville("Saint Petersbourg", 4_991_000, Continent.EUROPE);
		System.out.println(String.format("Résultat de ville1.equals(ville2) : %b", ville1.equals(ville2)));
		System.out.println(String.format("ville1 => %s\nville2 => %s", ville1, ville2));

		Ville ville3 = new Ville("Saint Petersbourg", 1_000_000, Continent.EUROPE);
		System.out.println(String.format("\nRésultat de ville1.equals(ville3) : %b", ville1.equals(ville3)));
		System.out.println(String.format("ville1 => %s\nville3 => %s", ville1, ville3));

		Ville ville4 = new Ville("Une autre ville avec le même nombre d'habs", 4_991_000, Continent.EUROPE);
		System.out.println(String.format("\nRésultat de ville1.equals(ville4) : %b", ville1.equals(ville4)));
		System.out.println(String.format("ville1 => %s\nville4 => %s", ville1, ville4));


		Ville ville5 = new Ville("Iakoutsk", 282_419, Continent.EUROPE);
		System.out.println(String.format("\nRésultat de ville1.equals(ville5) : %b", ville1.equals(ville5)));
		System.out.println(String.format("ville1 => %s\nville5 => %s", ville1, ville5));

		System.out.println(String.format("\nRésultat de ville1 == ville2 : %b", ville1 == ville2));
		System.out.println(String.format("ville1 => %s\nville2 => %s", ville1, ville2));

		System.out.println(String.format("\nRésultat de ville1.equals(new String(\"Truc\")) : %b", ville1.equals(new String("Truc"))));

		System.out.println(String.format("\nRésultat de ville1.equals(null) : %b", ville1.equals(null)));

		Ville ville6 = new Ville("Iakoutsk", 282_419, Continent.ASIE);
		System.out.println(String.format("\nRésultat de ville5.equals(ville6) : %b", ville5.equals(ville6)));
		System.out.println(String.format("ville5 => %s\nville6 => %s", ville5, ville6));
	}

}
