package Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericDemo {

	public static void main(String[] args) {
		functoin();
	}
	
	private static void functoin() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("abc");
		coll.add("bcd");
		coll.add("cde");
//		coll.add(1);
		
		Iterator<String> it = coll.iterator();
		
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}

}
