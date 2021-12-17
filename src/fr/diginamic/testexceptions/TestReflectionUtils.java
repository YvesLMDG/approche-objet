package fr.diginamic.testexceptions;

import listes.Continent;
import listes.Ville;

public class TestReflectionUtils {

	public static void main(String[] args) throws IllegalArgumentException,
	IllegalAccessException, ReflectionException {
	
		Ville ville = new Ville("Tarbes", 40_600, Continent.EUROPE);
		
		ReflectionUtils.afficherAttributs(ville);
		
		ReflectionUtils.afficherAttributs(null);
	}
	
}
