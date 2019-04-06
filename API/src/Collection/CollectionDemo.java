package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection<String> col = new ArrayList<String>();
		col.add("abc");
		col.add("bcd");
		System.out.println(col);
		
		boolean b = col.contains("abc");
		System.out.println(b);
		
		col.clear();
		System.out.println(col);
		
		col.add("huang");
		col.add("kai");
		System.out.println(col);
		
		Object[] objs = col.toArray();
		for (int i = 0; i < objs.length; ++i)
			System.out.println(objs[i]);
		
		col.add("kai");
		boolean b2 = col.remove("kai");
		System.out.println(b2);
		
		System.out.println(col.toString());
	}

}
