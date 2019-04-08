package Map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String, String> link = new LinkedHashMap<String, String>();
		link.put("1", "a");
		link.put("2", "b");
		link.put("1", "c");
		System.out.println(link);
	}

}
