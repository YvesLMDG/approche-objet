package fr.diginamic.banque.entites;

public class TestBanque {
	
	public static void main(String[] args) {
		
		Compte compte = new Compte(1, 100);
		CompteTaux compteTaux = new CompteTaux(2, 200, 5); 
		
		Compte[] arrayComptes = new Compte[2];
		arrayComptes[0] = compte;
		arrayComptes[1] = compteTaux;
		
		for (int i=0; i<arrayComptes.length; i++) {
			System.out.println(arrayComptes[i]);
		}
		
	}
	
}
