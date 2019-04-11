package Stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo3 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("/home/studycat/Documents/Java/java/IO/out/c.txt");
			fos.write(100);
		} catch (IOException e) {
			System.out.println(e.getMessage());
			throw new RuntimeException("file write fail.");
		} finally {
			try {
				if (fos != null) 
					fos.close();
			} catch (IOException e2) {
				System.out.println(e2.getMessage());
				throw new RuntimeException("file close fail.");
			}
			
		}

	}

}
