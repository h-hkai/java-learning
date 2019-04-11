package Stream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("/home/studycat/Documents/Java/java/IO/out/c.txt");
//		int i = fis.read();
//		System.out.println(i);
//		
//		i = fis.read();
//		System.out.println(i);
		
		int len = 0;
		while ((len = fis.read()) != -1) {
			System.out.print((char)len);
		}
		
		fis.close();
	}

}
