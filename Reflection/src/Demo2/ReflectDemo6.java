package Demo2;

import java.lang.reflect.Field;

public class ReflectDemo6 {
	public static void main(String[] args) throws Exception{
		Class c = Class.forName("Demo2.Person");
		Object obj = c.newInstance();
//		Field[] fields = c.getDeclaredFields();
//		for (Field f : fields)
//			System.out.println(f);
		
		Field field = c.getField("age");
		field.set(obj, 12);
		System.out.println(obj);
	}
}
