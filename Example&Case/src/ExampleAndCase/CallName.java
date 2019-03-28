package ExampleAndCase;

import java.util.ArrayList;

public class CallName {
	public static void main(String args) {
		ArrayList<StudentInformation> array = new ArrayList<StudentInformation>();
		add(array);
		System.out.println("array.size() = " + array.size());
		printArrayList(array);
		return;
	}
	
	public static void printArrayList(ArrayList<StudentInformation> array) {
		System.out.println("array.size() = " + array.size());
		for (int i = 0; i < array.size(); ++i) {
			System.out.println(i);
			StudentInformation s = array.get(i);
			System.out.println(s.name + ' ' + s.age);
		}
			
		return;
	}
	
	public static void add(ArrayList<StudentInformation> array) {
		StudentInformation s1 = new StudentInformation();
		StudentInformation s2 = new StudentInformation();
		StudentInformation s3 = new StudentInformation();
		StudentInformation s4 = new StudentInformation();
		StudentInformation s5 = new StudentInformation();
		
		s1.name = "Tom";
		s1.age = 18;
		
		s2.name = "Tom";
		s2.age = 18;
		
		s3.name = "Tom";
		s3.age = 18;
		
		s4.name = "Tom";
		s4.age = 18;
		
		s5.name = "Tom";
		s5.age = 18;
		
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		
		return;
	}
}
