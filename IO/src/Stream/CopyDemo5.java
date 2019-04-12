package Stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDemo5 {

	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new FileReader("/home/studycat/Documents/Java/java/IO/out/a.txt"));
		BufferedWriter bfw = new BufferedWriter(new FileWriter("/home/studycat/Documents/Java/java/IO/out/h.txt"));
		
		String line = null;
		while ((line = bfr.readLine()) != null) {
			bfw.write(line);
			bfw.newLine();
			bfw.flush();
		}
		
		bfw.close();
		bfr.close();
	}

}
