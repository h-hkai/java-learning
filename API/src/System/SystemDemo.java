package System;

public class SystemDemo {

	public static void main(String[] args) {
		function();

	}
	
	public static void function() {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; ++i) {
			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}
