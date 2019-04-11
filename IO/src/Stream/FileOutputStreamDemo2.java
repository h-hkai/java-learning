package Stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		File file = new File("/home/studycat/Documents/Java/java/IO/out/b.txt");
		FileOutputStream fos = new FileOutputStream(file);
		fos.write("hello\r\n".getBytes());
		fos.write("world".getBytes());
		fos.close();
	}
}
