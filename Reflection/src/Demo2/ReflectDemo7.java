package Demo2;

import java.lang.reflect.Method;

public class ReflectDemo7 {
	public static void main(String[] args) throws Exception{
		Class c = Class.forName("Demo2.Person");
		Object obj = c.newInstance();
		
		Method[] methods = c.getMethods();
		
		for (Method method : methods) {
			System.out.println(method);
		}
		
		Method method = c.getMethod("eat");
		System.out.println(method);
		
		method.invoke(obj);
	}
}
