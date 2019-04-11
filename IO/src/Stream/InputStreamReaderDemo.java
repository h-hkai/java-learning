package Stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {

	public static void main(String[] args) throws IOException {
		readGBK();
		readUTF();
	}
	
	public static void readGBK() throws IOException {
		FileInputStream fis = new FileInputStream("/home/studycat/Documents/Java/java/IO/out/utf.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		char[] ch = new char[1024];
		int len = isr.read(ch);
		System.out.println(new String(ch, 0, len));
		isr.close();
	}
	
	public static void readUTF() throws IOException {
		FileInputStream fis = new FileInputStream("/home/studycat/Documents/Java/java/IO/out/utf.txt");
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		char[] ch = new char[1024];
		int len = isr.read();
		System.out.println(new String(ch, 0, len));
		isr.close();
	}

}
