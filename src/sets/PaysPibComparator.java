package sets;

import java.util.Comparator;

public class PaysPibComparator implements Comparator<Pays>{
	
	public int compare(Pays p1, Pays p2) {
		int result = p1.getPib().compareTo(p2.getPib());
		return result;
	}
	
}
