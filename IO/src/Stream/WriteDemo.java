package Stream;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("/home/studycat/Documents/Java/java/IO/out/d.txt");
		fw.write(100);
		fw.flush();
		
		char[] c = {'a', 'b', 'c', 'd'};
		fw.write(c);
		fw.flush();
		
		fw.write("hello");
		fw.flush();
		
		fw.close();
	}

}
