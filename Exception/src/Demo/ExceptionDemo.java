package Demo;

public class ExceptionDemo {

	public static void main(String[] args) throws Exception {
		int[] arr = new int[0];
		int i = getArray(arr);
		System.out.println(i);
	}

	private static int getArray(int[] arr) throws Exception {
		if (arr == null) {
			throw new Exception("this array is null");
		}
		if (arr.length == 0) {
			throw new Exception("this array's length is 0.");
		}
		int i = arr[arr.length-1];
		
		return i*2;
	}

}
