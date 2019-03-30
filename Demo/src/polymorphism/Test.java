package polymorphism;

public class Test {

	public static void main(String[] args) {
		Father f = new Son();
		f.show();
		
		Animal c = new Cat();
		c.eat();
		
		Books b = new MathBooks();
		b.name();
	}

}
