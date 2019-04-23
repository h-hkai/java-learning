package Demo2;

import java.lang.reflect.Constructor;

public class ReflectDemo3 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("Demo2.Person");
		
		Constructor con = c.getConstructor(String.class, int.class);
		System.out.println(con);
		
		Object obj = con.newInstance("Tom", 18);
		System.out.println(obj);
	}
}
