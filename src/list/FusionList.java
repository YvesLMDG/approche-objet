package list;

import java.util.ArrayList;
import java.util.List;

public class FusionList {

	public static void main(String[] args) {
		
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		List<String> liste3 = new ArrayList<>();
		for(String s: liste1) {
			liste3.add(s);
		}
		for(String s: liste2) {
			liste3.add(s);
		}
		
		System.out.println("Elements de la liste3 : ");
		for(String s: liste3) {
			System.out.print(s + " ");
		}
		
	}

}
