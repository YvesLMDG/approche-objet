package list;

import java.util.ArrayList;
import java.util.List;

public class CreationList {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		for (int i=1; i<101; i++) {
			arrayList.add(i);
		}
		
		System.out.println("Taill de arrayList : " + arrayList.size());
	}
	
}
