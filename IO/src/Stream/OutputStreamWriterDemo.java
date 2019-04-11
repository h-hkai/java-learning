package Stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {

	public static void main(String[] args) throws IOException {
		writeGBK();
		writeUTF();
	}
	
	public static void writeGBK() throws IOException {
		FileOutputStream fos = new FileOutputStream("/home/studycat/Documents/Java/java/IO/out/gbk.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		
		osw.write("Hello");
		osw.close();
	}
	
	public static void writeUTF() throws IOException {
		FileOutputStream fos = new FileOutputStream("/home/studycat/Documents/Java/java/IO/out/utf.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		osw.write("Hello");
		osw.close();
	}
		
}
