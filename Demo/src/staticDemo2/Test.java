package staticDemo2;

public class Test {
	public static final double PI = 3.14;
	
	public static void main(String[] args) {
		Father f = new Son();
		System.out.println(f.i);
		Father.show();
	}
}
