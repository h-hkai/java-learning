package Stream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("/home/studycat/Documents/Java/java/IO/out/c.txt");
		byte[] b = new byte[2];
		int len = 0;
		
		while ((len = fis.read(b)) != -1) {
			System.out.print(new String(b, 0, len));
		}
		
		fis.close();
	}

}
