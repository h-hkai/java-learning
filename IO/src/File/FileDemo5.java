package File;

import java.io.File;

public class FileDemo5 {

	public static void main(String[] args) {
		function();
		function2();
		function3();
	}

	private static void function3() {
		File[] fileArr = File.listRoots();
		for (File f : fileArr)
			System.out.println(f);
		
	}

	private static void function() {
		File file = new File("/home/studycat/Documents/Java/java/IO/ou");
		boolean b = file.exists();
		System.out.println(b);
		if (b) {
			boolean b2 = file.isDirectory();
			System.out.println(b2);	
		}

	}
	
	public static void function2() {
		File file = new File("/home/studycat/Documents/Java/java");
		String[] list = file.list();
		System.out.println(list.length);
		for (String s : list) 
			System.out.println(s);
		
		File[] subFiles = file.listFiles();
		for (File f : subFiles) {
			String s = f.getName();
			System.out.println(s);
			System.out.println(f);
		}
			
	}

}
