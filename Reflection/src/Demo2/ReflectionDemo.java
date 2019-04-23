package Demo2;

public class ReflectionDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		Person p = new Person();
		Class c = p.getClass();
		System.out.println(c);
		
		Class c1 = Person.class;
		System.out.println(c1);
		
		System.out.println(c == c1);
		System.out.println(c.equals(c1));
		
		Class c2 = Class.forName("Demo2.Person");
		System.out.println(c2);
		
	}
}
