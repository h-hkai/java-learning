package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EntrySetDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "abc");
		map.put(2, "bcd");
		map.put(3, "cde");
		
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		
		Iterator<Map.Entry<Integer, String>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> m = it.next();
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		System.out.println("=======");
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
