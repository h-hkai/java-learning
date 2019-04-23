package Demo3;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectTest {
	public static void main(String[] args) throws Exception{
		ArrayList<String> array = new ArrayList<String>();
		array.add("a");
		Class c = array.getClass();
		Method method = c.getMethod("add", Object.class);
		System.err.println(method);
		method.invoke(array, 150);
		method.invoke(array, 267);
		
		System.out.println(array);
		
		for (Object a : array)
			System.out.println(a);
	}
}
