package Stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("/home/studycat/Documents/Java/java/IO/out/a.txt");
		fos.write(100);
		
		byte[] bytes = {65, 66, 67, 68};
		fos.write(bytes);
		
		fos.write(bytes, 1, 2);
		
		fos.write("Hello Word!".getBytes());
		
		fos.close();
	}
}
