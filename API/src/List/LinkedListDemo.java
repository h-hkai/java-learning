package List;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		function();
		function2();
	}

	private static void function2() {
		LinkedList<String> link = new LinkedList<String>();
		link.add("bac");
		link.add("bcd");
		link.addFirst("kai");
		link.addLast("huang");
		
		System.out.println(link);
		
		String first = link.removeFirst();
		String last = link.removeLast();
		
		System.out.println(first + " " + last);
		
	}

	private static void function() {
		LinkedList<String> link = new LinkedList<String>();
		
		link.add("bac");
		link.add("bcd");
		link.addFirst("kai");
		link.addLast("huang");
		
		System.out.println(link);
		
		String first = link.getFirst();
		String last = link.getLast();
		System.out.println(first + " " + last);
		
	}

}
