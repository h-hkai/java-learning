package Demo;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		try {
			function(0);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("have to exception.");
		}

	}
	
	public static void function(int a) throws Exception {
		if (a == 0) {
			throw new Exception();
		}
	}

}
