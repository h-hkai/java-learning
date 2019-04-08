package Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		function();
		function2();
		functino3();
	}

	private static void functino3() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		System.out.println(map);
		
		String s = map.remove(3);
		System.out.println(map);
		System.out.println(s);
		
	}

	private static void function2() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		System.out.println(map);
		
		String value = map.get(4);
		System.out.println(value);
		
	}

	private static void function() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		System.out.println(map);
		
		Integer i = map.put("a", 5);
		System.out.println(i);
		System.out.println(map);
	}

}
