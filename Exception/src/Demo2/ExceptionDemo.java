package Demo2;

public class ExceptionDemo {


	public static void main(String[] args) {
		try {
			int age = getAvg(50, 60, 70, -30);
			System.out.println(age);
		} catch (NegException e) {
			System.out.println(e);
		}

		
	}
	
	public static int getAvg(int...soure) {
		int sum = 0;
		for (int s : soure) {
			if (s < 0) throw new NegException("This is a negative." + s);
			sum += s;
		}
		return sum/soure.length;
	}

}
