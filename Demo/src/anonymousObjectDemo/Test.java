package anonymousObjectDemo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Person p = new Person();
		p.eat();
		
		new Person().eat();
		
		int num = new Scanner(System.in).nextInt();
		
		System.out.println(num);
		
		method(p);
		method(new Person());
		
		method().eat();
	}
	
	public static Person method() {
		Person p = new Person();
		return p;
	}
	
	public static void method(Person p) {
		p.eat();
	}

}
