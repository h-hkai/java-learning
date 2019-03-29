package ObjectOriented;

public class TestPrivateDemo {
	public static void main(String[] arg0) {
		PrivateDemo p1 = new PrivateDemo();
		p1.setAge(18);
		p1.setName("Tom");
		
		int age = p1.getAge();
		String name = p1.getName();
		
		System.out.println(age + " " + name);
	}
}
