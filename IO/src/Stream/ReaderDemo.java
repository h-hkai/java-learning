package Stream;

import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("/home/studycat/Documents/Java/java/IO/out/d.txt");
		int len = 0;
		char[] ch = new char[1024];
		while ((len = fr.read(ch)) != -1) {
			System.out.print(new String(ch, 0, len));
		}
		fr.close();
	}
	
}
