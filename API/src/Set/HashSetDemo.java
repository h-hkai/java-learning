package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("cn");
		set.add("us");
		set.add("hk");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
		for (String s : set) {
			System.out.println(s);
		}

	}

}
