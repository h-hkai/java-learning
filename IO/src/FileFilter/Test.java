package FileFilter;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		File file = new File("/home/studycat/Documents/Java/java");
		File[] fileArr = file.listFiles(new FileFilterDemo());
		for (File f : fileArr)
			System.out.println(f);

	}

}
