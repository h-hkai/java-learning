package ThisDemo;

public class Person {

	private String name;
	private int age;
	
	public Person() {
		this("Tom", 30);
	}
	
	public Person(String name, int age) {
		System.out.println("Person.Person()");
		this.name = name;
		this.age = age;
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