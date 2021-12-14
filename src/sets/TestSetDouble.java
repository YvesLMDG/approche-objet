package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestSetDouble {
	
	public static void main(String[] args) {
		Set<Double> hashsetDouble = new HashSet<>();
		Collections.addAll(hashsetDouble, 1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01);
		
		for(Double d: hashsetDouble) {
			System.out.print(d + " ");
		}
		System.out.print("\n");
		
		//Plus grand et plus petit éléments de la collection
		Double max = Double.MIN_VALUE;
		Double min = Double.MAX_VALUE;
		for (Double d: hashsetDouble) {
			if(d.compareTo(max)>0) {
				max = d;
			}
			if(d.compareTo(min)<0) {
				min = d;
			}
		}
		
		hashsetDouble.remove(min);
		for(Double d: hashsetDouble) {
			System.out.print(d + " ");
		}
	}
	
}
