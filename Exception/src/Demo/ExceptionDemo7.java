package Demo;

public class ExceptionDemo7 {
	public static void main(String[] args) {
		try {
			function();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}
	
	public static void function() throws Exception {
		throw new Exception("exception.");
	}
}
