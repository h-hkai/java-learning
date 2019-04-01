package ComputerDemo;

public class Computer {
	public void openComputer() {
		System.out.println("Computer Open...");
	}
	
	public void closeComputer() {
		System.out.println("Computer close...");
	}
	
	public void useUSB(USB u) {
		u.open();
		u.close();
	}
}
