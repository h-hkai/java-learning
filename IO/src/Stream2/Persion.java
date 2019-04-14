package Stream2;

import java.io.Serializable;

public class Persion implements Serializable{
	private String name;
	private static int age;
	
	public Persion(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Persion() {
		
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
	
	@Override
	public String toString() {
		return this.name + " " + this.age;
	}
	
}
