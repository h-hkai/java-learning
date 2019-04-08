package Set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> link = new LinkedHashSet<Integer>();
		link.add(28);
		link.add(10);
		link.add(10);
		link.add(39);
		
		System.out.println(link);
	}

}
