package sets;

import java.util.Comparator;

public class PaysPibParHabComparator implements Comparator<Pays> {
	
	public int compare(Pays p1, Pays p2) {
		int result = p1.getPibParHab().compareTo(p2.getPibParHab());
		return result;
	}
	
}
