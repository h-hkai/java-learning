package File;

import java.io.File;

public class FileDemo2 {
	public static void main(String[] args) {
		function();
		function2();
		function3();
	}
	
	private static void function3() {
		File parent = new File("/home");
		File file = new File(parent, "/studycat/Documents/Java/java/IO");
		System.out.println(file);
	}

	private static void function2() {
		File file = new File("/home", "/studycat/Documents/Java/java/IO");
		System.out.println(file);
	}

	public static void function() {
		File file = new File("/home/studycat/Documents/Java/java/IO");
		System.out.println(file);
	}
}
