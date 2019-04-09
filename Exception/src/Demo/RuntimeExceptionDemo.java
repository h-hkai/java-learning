package Demo;

public class RuntimeExceptionDemo {

	public static void main(String[] args) {

		double d = getArea(-1);
		System.out.println(d);

	}
	
	public static double getArea(double r) {
		if (r <= 0) {
			throw new RuntimeException("RunTimeException.");
		}
		return r * r * Math.PI;
	}
	
	public static void function() {
//		throw new Exception();
		throw new RuntimeException();
	}
}
