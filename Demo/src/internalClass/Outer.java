package internalClass;

public class Outer {
	private int i = 1;
	class Inner {
		int i = 2;
		public void innerFun() {
			int i = 3;
			System.out.println("Outer.Inner.innerFun()" + Outer.this.i);
		}
	}
}
