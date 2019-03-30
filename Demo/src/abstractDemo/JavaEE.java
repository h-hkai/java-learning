package abstractDemo;

public class JavaEE extends Develop {

	@Override
	public void work() {
		System.out.println("JavaEEer work...");
		System.out.println(super.getName() + " " + super.getId());
	}
	
}
