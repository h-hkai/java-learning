package interfaceDemo;

public class Test {

	public static void main(String[] args) {
		MyInterfaceImpl my = new MyInterfaceImpl();
		my.function();
		System.out.println(MyInter.x);
	}
}
