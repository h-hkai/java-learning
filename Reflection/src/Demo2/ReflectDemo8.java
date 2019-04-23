package Demo2;

import java.lang.reflect.Method;

public class ReflectDemo8 {
	public static void main(String[] args) throws Exception{
		Class c = Class.forName("Demo2.Person");
		Object obj = c.newInstance();
		Method method = c.getMethod("sleep", String.class, int.class, double.class);
		method.invoke(obj, "sleep", 100, 29.3);
		
	}
}
