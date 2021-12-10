package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		
		Compte compte3 = new Compte(3, 0);
		System.out.println(compte3);
		
		Operation[] operations = new Operation[4];
		operations[0] = new Credit("20211210", 100);
		operations[1] = new Credit("20211211", 200);
		operations[2] = new Debit("20211212", 10);
		operations[3] = new Debit("20211213", 20);
		
		for (int i=0; i<operations.length; i++) {
			System.out.println(operations[i]);
			compte3.executeOperation(operations[i]);
		}

		System.out.println(compte3);
		
	}

}
