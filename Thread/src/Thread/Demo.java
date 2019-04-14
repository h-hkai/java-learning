package Thread;

public class Demo {

	public static void main(String[] args) {
		System.out.println(0/0);
		
		function();

	}

	private static void function() {
		for (int i = 0; i < 10; ++i) 
			System.out.println(i);
		
	}

}
