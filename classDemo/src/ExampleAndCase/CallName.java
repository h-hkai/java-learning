package ExampleAndCase;

import java.util.ArrayList;
import java.util.Random;

public class CallName {
	public static void main(String[] args) {
		ArrayList<StudentInformation> array = new ArrayList<StudentInformation>();
		add(array);
		printArrayList(array);
		return;
	}
	
	public static void callStudent(ArrayList<StudentInformation> array) {
		Random r = new Random();
		int number = r.nextInt(array.size());
		StudentInformation s = array.get(number);
		System.out.println(s.name + ' ' + s.age);
	}
	
	public static void printArrayList(ArrayList<StudentInformation> array) {
		for (int i = 0; i < array.size(); ++i) 
			callStudent(array);
//			System.out.println(array.get(i).name + ' ' + array.get(i).age);
			
		return;
	}
	
	public static void add(ArrayList<StudentInformation> array) {
		StudentInformation s1 = new StudentInformation();
		StudentInformation s2 = new StudentInformation();
		StudentInformation s3 = new StudentInformation();
		StudentInformation s4 = new StudentInformation();
		StudentInformation s5 = new StudentInformation();
		
		s1.name = "Tom1";
		s1.age = 18;
		
		s2.name = "Tom2";
		s2.age = 18;
		
		s3.name = "Tom3";
		s3.age = 18;
		
		s4.name = "Tom4";
		s4.age = 18;
		
		s5.name = "Tom5";
		s5.age = 18;
		
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		
		return;
	}
}
