package Demo2;

import java.lang.reflect.Constructor;

public class ReflectionDemo2 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("Demo2.Person");
		
//		Constructor[] cons = c.getConstructors();
//		for (Constructor con : cons) {
//			System.out.println(con);
//		}
//		
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		System.out.println(obj.toString());
	}
}
