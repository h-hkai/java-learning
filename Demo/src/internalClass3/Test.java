package internalClass3;

public class Test {
	public static void main(String[] args) {
		new Eat() {
			
			@Override
			public void eat() {
				System.out.println("Test.main(...).new Eat() {...}.eat()");
				
			}
		}.eat();
		
		new Animal() {
			
			@Override
			public void sleep() {
				System.out.println("Test.main(...).new Animal() {...}.sleep()");
			}
			
			@Override
			public void eat() {
				System.out.println("Test.main(...).new Animal() {...}.eat()");
			}
		}.sleep();
	}
}
