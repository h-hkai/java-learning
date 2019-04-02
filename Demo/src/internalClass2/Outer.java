package internalClass2;

public class Outer {
	public void out() {
		class Inner{
			public void inner() {
				System.out.println("Outer.out().Inner.inner()");
			}
		}
		
		Inner in = new Inner();
		in.inner();
	}
	

}
