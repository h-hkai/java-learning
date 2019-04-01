package finalDemo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f = new Father();
		Son s = new Son();
		
		f.show();
		
		s.finalFunc();
		s.show();
		
		final int i = 10;
		final Son s2 = new Son();
	}

}
