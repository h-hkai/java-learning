package File;

import java.io.File;

public class FileDemo4 {

	public static void main(String[] args) {
		function();

	}

	private static void function() {
		File file = new File("/home/studycat/Documents/Java/java/IO/out");
		String name = file.getName();
		System.out.println(name);
		
		String path = file.getPath();
		System.out.println(path);
		
		long len = file.length();
		System.out.println(len);
		
		String absolutePath = file.getAbsolutePath();
		System.out.println(absolutePath);
		
		File absoulte = file.getAbsoluteFile();
		System.out.println(absoulte);
		
		String parent = file.getParent();
		System.out.println(parent);
		
		File parentFile = file.getParentFile();
		System.out.println(parentFile);
	}

}
