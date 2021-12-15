package tri;

import java.util.Comparator;

public class ComparatorNom implements Comparator<Ville>{
	public int compare(Ville ville1, Ville ville2) {
		
		return ville1.getNom().compareTo(ville2.getNom());
		
	}
}
