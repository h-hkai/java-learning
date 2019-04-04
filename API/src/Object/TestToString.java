package Object;

import java.util.Random;
import java.util.Scanner;

public class TestToString {
	public static void main(String[] arg0) {
		Person p = new Person("Tom", 20);
		String s = p.toString();
		
		System.out.println(p);
		System.out.println(s);
		
		Random r = new Random();
		System.out.println(r.toString());
		
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.toString());
	}

}
