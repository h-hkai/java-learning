package Demo2;

public class Person {
	private String name;
	private int age;
	
	public Person() {}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	private Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void eat() {
		System.out.println("eat...........");
	}
	
	public void sleep(String s, int a, double d) {
		// TODO Auto-generated method stub
		System.out.println("sleep" + s + "........" + a + "......." + d);
	}
	
	private void playGame() {
		System.out.println("play game........");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
