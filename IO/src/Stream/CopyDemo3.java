package Stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDemo3 {

	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("/home/studycat/Documents/Java/java/IO/out/d.txt");
			fw = new FileWriter("/home/studycat/Documents/Java/java/IO/out/e.txt");
			char[] cbuf = new char[1024];
			int len = 0;
			while ((len = fr.read(cbuf)) != -1) {
				fw.write(cbuf, 0, len);
				fw.flush();
			}
		} catch (IOException e) {
			System.out.println(e);
			throw new IOException("Copy file.");
		} finally {
			try {
				if (fw != null) 
					fw.close();
			} catch (IOException e1) {
				System.out.println(e1.getMessage());
				throw new RuntimeException("file close fail.");
			}
			try {
				if (fr != null)
					fr.close();
			} catch (IOException e2) {
				System.out.println(e2);
				throw new RuntimeException("file close fail.");
			}
		}
	}

}
