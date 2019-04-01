package ComputerDemo;

public class Test {
	public static void main(String[] arg0) {
		Computer com = new Computer();
		com.openComputer();
		
		Mouse m = new Mouse();
		com.useUSB(m);
		
		keyBoard k = new keyBoard();
		com.useUSB(k);
		
		com.closeComputer();
	}
}
