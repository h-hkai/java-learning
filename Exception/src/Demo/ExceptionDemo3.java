package Demo;

public class ExceptionDemo3 {

	public static void main(String[] args) throws Exception {
		try {
			function(0);
		} catch (NullPointerException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

	}
	
	public static void function(int a) throws Exception {
		if (a == 0) {
			throw new NullPointerException();
		} if (a == 1) {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

}
