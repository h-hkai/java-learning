package NewProperty;

public class VarArgumentsDemo {
	public static void main(String[] args) {
		getSum();
		int sum;
		sum = getSum(1, 1, 4);
		System.out.println(sum);
	}

	public static int getSum(int a, int b, int c) {
		return a + b + c;
	}
	
	public static int getSum(int...a) {
		int len = a.length;
		System.out.println(len);
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		return sum;
	}

}
