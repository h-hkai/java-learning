package Integer;

public class IntegerDemo2 {
	public static void main(String[] args) {
		function();
		function1();
	}
	
	public static void function() {
		Integer in = 1;
		in += 1;
		System.out.println(in.toString());
	}
	
	public static void function1() {
		Integer in = 1;
		if (in != null) {
			in += 1;
		}
		System.out.println(in);
	}
}
