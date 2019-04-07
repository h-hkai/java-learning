package List;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		function();
		function2();
		function3();
	}

	private static void function3() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		Integer i = list.set(0, 21);
		System.out.println(i);
		System.out.println(list);
		
	}

	private static void function2() {
		List<Double> list = new ArrayList<Double>();
		list.add(1.1);
		list.add(1.2);
		list.add(1.3);
		System.out.println(list);
		
		Double d = list.remove(0);
		System.out.println(d);
		System.out.println(list);
		
	}

	private static void function() {
		List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		System.out.println(list);
		
		list.add(3, "kai");
		System.out.println(list);
	}

}
