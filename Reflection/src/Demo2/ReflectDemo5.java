package Demo2;

import java.lang.reflect.Constructor;

public class ReflectDemo5 {
	public static void main(String[] args) throws Exception{
		Class c = Class.forName("Demo2.Person");
		
		Constructor[] cons = c.getDeclaredConstructors();
		
		for (Constructor con : cons) {
			System.out.println(con);
		}
		
		Constructor con = c.getConstructor(int.class, String.class);
		
//		con.setAccessible(true);
		
		Object obj = con.newInstance(18, "list");
		System.out.println(obj);
		
	}
}
