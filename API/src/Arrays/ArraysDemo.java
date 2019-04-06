package Arrays;

import java.util.*;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] arr = {1, 4, 2, 7, 3};
		Arrays.sort(arr);
		for (int a : arr)
			System.out.println(a);
		int index = Arrays.binarySearch(arr, 2);
		System.out.println(index);
		
		String s = Arrays.toString(arr);
		System.out.println(s);
	}


}
