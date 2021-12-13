package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {

		String chaine = "Durand;Marcel;2 523.5";
		
		//1
		char premierCaractere = chaine.charAt(0);		
		System.out.println("Premier caractère : " + premierCaractere);
		//2
		System.out.println("Longueur de la chaîne de caractères : " + chaine.length());
		//3
		System.out.println("Index du premier \";\" : " + chaine.indexOf(';'));
		//4
		int firstIndex = chaine.indexOf(';');
		int secondIndex = chaine.indexOf(';', firstIndex + 1);
		String nom = chaine.substring(firstIndex+1, secondIndex);
		System.out.println("Nom de fammille: " + nom);
		//5
		System.out.println(nom.toUpperCase());
		//6
		System.out.println(nom.toLowerCase());
		//7
		String [] stringArray = chaine.split(";");
		for (int i=0; i<stringArray.length-1; i++) {
			System.out.print(stringArray[i]+ " | ");
		}
		System.out.print(stringArray[stringArray.length-1]+"\n");
		//9
		String nomSalarie = stringArray[0];
		String prenomSalarie =  stringArray[1];
		double salaire = Double.parseDouble(stringArray[2].replace(" ", ""));
		Salarie salarie1 = new Salarie(nomSalarie, prenomSalarie, salaire);
		System.out.println(salarie1);
		

	}

}
