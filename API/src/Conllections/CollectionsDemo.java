package Conllections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		function();
		function2();
		function3();
	}
	
	private static void function3() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(17);
		list.add(7);
		list.add(27);
		list.add(19);
		
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
	}

	private static void function2() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(17);
		list.add(7);
		list.add(27);
		list.add(19);
		
		Collections.sort(list);
		int idx = Collections.binarySearch(list, 17);
		System.out.println(idx);
		
	}

	public static void function() {
		List<String> list = new ArrayList<String>();
		list.add("Zbcd");
		list.add("dcde");
		list.add("cdef");
		list.add("defg");
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
	}

}
