package Generic;

import java.util.ArrayList;

public class GenericDemo2 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(123);
		arr.add(234);
		
		Integer[] i = new Integer[arr.size()];
		Integer[] g = arr.toArray(i);
		for (Integer k : g)
			System.out.println(k);
	}

}
