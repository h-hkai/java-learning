package Thread2;

public class NameThread extends Thread {
	public NameThread() {
		super("Tom");
	}
	
	@Override
	public void run() {
		System.out.println(getName());
	}
}
