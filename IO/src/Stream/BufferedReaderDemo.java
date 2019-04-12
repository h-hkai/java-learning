package Stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(
				new FileReader("/home/studycat/Documents/Java/java/IO/out/a.txt"));
		
		String rl = null;
		while ((rl = bfr.readLine()) != null) {
			System.out.println(rl);
		}
		
		String line = bfr.readLine();
		System.out.println(line);
		
		line = bfr.readLine();
		System.out.println(line);
		
		line = bfr.readLine();
		System.out.println(line);
		
		bfr.close();

	}

}
