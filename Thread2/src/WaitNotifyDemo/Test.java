package WaitNotifyDemo;

public class Test {

	public static void main(String[] args) {
		Resource r = new Resource();
		
		Input in = new Input(r);
		Output out = new Output(r);
		
		Thread tin = new Thread(in);
		Thread tout = new Thread(out);
		
		tin.start();
		tout.start();

	}

}
