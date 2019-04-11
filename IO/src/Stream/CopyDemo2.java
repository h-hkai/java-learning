package Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo2 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("/home/studycat/Documents/Java/java/IO/out/c.txt");
			fos = new FileOutputStream("/home/studycat/Documents/Java/java/c.txt");
			byte[] bytes = new byte[1024];
			int len = 0;
			while ((len = fis.read()) != -1) {
				fos.write(bytes, 0, len);
			}
		} catch (IOException e) {
			System.out.println(e);
			throw new RuntimeException("copy fail.");
		} finally {
			try {
				if (fos != null)
					fos.close();
			} catch (IOException e2) {
				throw new RuntimeException("free fail.");
			} finally {
				try {
					if (fis != null)
						fis.close();
				} catch (IOException e3) {
					throw new RuntimeException("free error.");
				}
			}
		}

	}
	
}
