package Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo2 {

	public static void main(String[] args) {
		Collection coll = new ArrayList<>();
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		
		Iterator it = coll.iterator();
		while(it.hasNext()) {
			String s = (String)it.next();
			System.out.println(s);
		}
	}

}
