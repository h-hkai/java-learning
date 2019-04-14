package Stream2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws FileNotFoundException {
		//function();
		//function2();
		//function3();
		//function4();
		function5();
	}
	
	public static void function() throws FileNotFoundException {
		File file = new File("/home/studycat/Documents/Java/java/IO/out/h.txt");
		PrintWriter pw = new PrintWriter(file);
		pw.println(100);
		pw.close();
	}
	
	public static void function2() {
		int[] arr = {1};
		System.out.println(arr);
		
		char[] ch = {'a', 'b'};
		System.out.println(ch);

		
	}
	
	public static void function3() throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("/home/studycat/Documents/Java/java/IO/out/i.txt");
		pw.println(3.5);
		pw.close();
	}
	
	public static void function4() throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("/home/studycat/Documents/Java/java/IO/out/j.txt");
		PrintWriter pw = new PrintWriter(fos);
		pw.println("PrintWriteStream.");
		pw.close();
	}
	
	public static void function5() throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("/home/studycat/Documents/Java/java/IO/out/j.txt");
		PrintWriter pw = new PrintWriter(fos, true);
		pw.println("i");
		pw.println("love");
		pw.println("java");
		pw.close();
	}

}
