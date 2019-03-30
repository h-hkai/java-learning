package abstractDemo;

public class NetWork extends Maintain {

	@Override
	public void work() {
		System.out.println("Networker work...");
		System.out.println(super.getName() + " " + super.getId());
	}

}
