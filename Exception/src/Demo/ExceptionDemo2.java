package Demo;

public class ExceptionDemo2 {

	public static void main(String[] args) throws Exception {
		int[] arr = null;
		try {
			int i = getArray(arr);
			System.out.println(i);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		System.out.println("Game Over!");
	}
	
	public static int getArray(int[] arr) throws Exception {
		if (arr == null) {
			throw new Exception("this array is null.");
		}
		if (arr.length < 3) {
			throw new ArrayIndexOutOfBoundsException("this arr don't have this index.");
		}
		return arr[3] + 1;
	}

}
