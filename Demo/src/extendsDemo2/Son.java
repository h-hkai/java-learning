package extendsDemo2;

public class Son extends Fater {
	int i = 2;
	
	public void show() {
		int i = 3;
		System.out.println(super.i);
	}
}
