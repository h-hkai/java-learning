package File;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {

	public static void main(String[] args) {
		try {
			function3();
			function2();
			function();
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}
	
	public static void function() throws IOException {
		File file = new File("/home/studycat/Documents/Java/java/IO/out/out.txt");
		boolean b = file.createNewFile();
		System.out.println(b);
	}
	
	public static void function2() throws IOException {
		File file = new File("/home/studycat/Documents/Java/java/IO/out");
		boolean b = file.mkdir();
		System.out.println(b);
	}
	
	public static void function3() {
		File file = new File("/home/studycat/Documents/Java/java/IO/out");
		boolean b = file.delete();
		System.out.println(b);
	}
}
