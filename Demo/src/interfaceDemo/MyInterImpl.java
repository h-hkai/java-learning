package interfaceDemo;

public class MyInterImpl implements MyInter {
	public void show() {
		System.out.println("working in MyInterImpl...");
	}

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}
}
