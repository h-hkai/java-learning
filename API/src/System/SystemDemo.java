package System;

public class SystemDemo {

	public static void main(String[] args) {
		
//		function();
		
//		function2();
		
//		function3();
		
//		function4();
		
		function5();
	}
	
	public static void function() {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; ++i) {
			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	public static void function2() {
		System.exit(0);
	}
	
	public static void function3() {
		System.gc();
	}
	
	public static void function4() {
		System.out.println(System.getProperty(""));
	}
	
	public static void function5() {
		int[] src = {1, 2, 3, 4};
		int[] tar = {5, 6, 7};
		System.arraycopy(src, 1, tar, 1, 2);
		
		for (int i : src)
			System.out.print(i);
		System.out.println();
		for (int i : tar)
			System.out.print(i);
		System.out.println();
	}
}
