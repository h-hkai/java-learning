package Stream2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo2 {

	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new FileReader("/home/studycat/Documents/Java/java/IO/out/j.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("/home/studycat/Documents/Java/java/IO/out/k.txt"));
		String line = null;
		while ((line = bfr.readLine()) != null) {
			pw.println(line);
		}
		pw.close();
		bfr.close();
	}

}
