package staticDemo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.name = "Tom";
		p2.name = "Pill";
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		
		p1.className = "class one";
		System.out.println(p2.className);
		System.out.println(Person.className);
	}

}
