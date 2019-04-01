package autoChangeType;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		
		a1.eat();
		a2.eat();
		
		if (a1 instanceof Cat) {
			Cat c = (Cat)a1;
			c.catchMouse();
		}
		
		if (a2 instanceof Dog) {
			Dog d = (Dog)a2;
			d.lookHome();
		}
	}

}
