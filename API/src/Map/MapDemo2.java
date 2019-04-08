package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 11);
		map.put("b", 12);
		map.put("c", 13);
		System.out.println(map.getClass());
		
		Set<String> set = map.keySet();
		System.out.println(set.getClass());
		
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			Integer value = map.get(key);
			System.out.println(key + " " + value);
		}
		
		System.out.println("============");
		
		for (String key : set) {
			Integer value = map.get(key);
			System.out.println(key + ' ' + value);
		}
	}

}
