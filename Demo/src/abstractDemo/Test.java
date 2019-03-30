package abstractDemo;

public class Test {

	public static void main(String[] args) {
		JavaEE ee = new JavaEE();
		NetWork nw = new NetWork();
		
		ee.setName("Tom");
		ee.setId("develop001");

		nw.setName("Mrio");
		nw.setId("networker001");
		
		ee.work();
		nw.work();
	}

}
