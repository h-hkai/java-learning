package FileFilter;

import java.io.File;
import java.io.FileFilter;

public class FileDemo {

	public static void main(String[] args) {
		File dir = new File("/home/studycat/Documents/Java/java");
		getAllDir(dir);

	}

	private static void getAllDir(File dir) {
		File[] fileArr = dir.listFiles();
		for (File f : fileArr) {
			if (f.isDirectory())
				getAllDir(f);
			else if (f.getName().endsWith(".java"))
				System.out.println(f);
				
		}
		
	}

}
