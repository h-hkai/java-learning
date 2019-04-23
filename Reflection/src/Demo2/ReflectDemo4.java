package Demo2;

public class ReflectDemo4 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("Demo2.Person");
		
		Object obj = c.newInstance();
		System.out.println(obj);
	}
}
