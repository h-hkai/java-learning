package staticDemo;

public class Student {
	private static String name;
	private static int age;
	
	public static void function() {
		System.out.println(name + age);
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.method();
		function();
	}
	
	public void method() {
		
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
}
