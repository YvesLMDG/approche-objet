package fr.diginamic.entites;

import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		Cercle cercle1 = new Cercle(10);
		Cercle cercle2 = new Cercle(20);

		System.out.println("Périmètre du cercle1 : " + cercle1.perimetre());
		System.out.println("Surface du cercle1 : " + cercle1.surface());
		
		System.out.println("Périmètre du cercle2 : " + cercle2.perimetre());
		System.out.println("Surface du cercle2 : " + cercle2.surface());
		
		Cercle cercle3 = CercleFactory.createCercle(30);
		System.out.println("Périmètre du cercle3 : " + cercle3.perimetre());
		System.out.println("Surface du cercle3 : " + cercle3.surface());
	}
}
