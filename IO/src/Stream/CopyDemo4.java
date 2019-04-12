package Stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo4 {

	public static void main(String[] args) throws IOException {
		long s = System.currentTimeMillis();
		copy_2(new File("/home/studycat/Documents/Java/java/IO/out/e.txt"), 
				new File("/home/studycat/Documents/Java/java/IO/out/g.txt"));
		long e = System.currentTimeMillis();
		System.out.println(e-s);
	}
	
	public static void copy_1(File src, File desc) throws IOException {
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(desc);
		
		int len = 0;
		byte[] bytes = new byte[1024];
		while ((len = fis.read(bytes)) != -1) {
			fos.write(bytes, 0, len);
		}
		
		fos.close();
		fis.close();
	}
	
	public static void copy_2(File src, File desc) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desc));
		int len = 0;
		while ((len = bis.read()) != -1) {
			bos.write(len);
		}
		bos.close();
		bis.close();
	}
	
}