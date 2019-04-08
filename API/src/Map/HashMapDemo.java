package Map;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Person> map = new HashMap<String, Person>();
		map.put("beijing", new Person("a", 20));
		map.put("shanghai", new Person("b", 21));
		map.put("guangzhou", new Person("c", 22));
		
		for (String key : map.keySet()) {
			Person value = map.get(key);
			System.out.println(key + " " + value);
		}
	}
}
