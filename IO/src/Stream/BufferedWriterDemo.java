package Stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("/home/studycat/Documents/Java/java/IO/out/e.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(100);
		bw.flush();
		
		bw.newLine();
		
		bw.write("Hello World.\n".toCharArray());
		bw.flush();
		
		bw.write("Java.\n".toCharArray());
		bw.flush();
		
		bw.close();

	}

}
