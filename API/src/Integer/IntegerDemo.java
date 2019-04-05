package Integer;

public class IntegerDemo {

	public static void main(String[] args) {
		function();
		
		function2();
		
		function3();
		
		function4();

		function5();
	}
	
	public static void function() {
		int i = Integer.parseInt("1009988");
		System.out.println(i/2);
	}

	public static void function2() {
		int i = Integer.parseInt("111", 2);
		System.out.println(i);
	}
	
	public static void function3() {
		int i = 3;
		String s = i + "";
		System.out.println(s);
		
		String s1 = Integer.toString(5, 2);
		System.out.println(s1);
	}
	
	public static void function4() {
		@SuppressWarnings("deprecation")
		Integer in = new Integer("100");
		int i = in.intValue();
		System.out.println(i);
	}
	
	public static void function5() {
		System.out.println(Integer.toBinaryString(999));
		System.out.println(Integer.toOctalString(999));
		System.out.println(Integer.toHexString(999));
	}
}
