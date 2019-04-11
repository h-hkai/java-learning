package Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		long s = System.currentTimeMillis();
		try {
			fis = new FileInputStream("/home/studycat/Documents/Java/java/IO/out/c.txt");
			fos = new FileOutputStream("/home/studycat/Documents/Java/java/c.txt");
			int len = 0;
			while ((len = fis.read()) != -1) {
				fos.write(len);
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
		long e = System.currentTimeMillis();
		System.out.println(e - s);

	}

}
