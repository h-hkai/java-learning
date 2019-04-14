package Properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		function();
		function2();
		function3();
	}
	
	public static void function3() throws IOException {
		Properties pro = new Properties();
		pro.setProperty("name", "Jerry");
		pro.setProperty("age", "31");
		pro.setProperty("email", "123456789@qq.com");
		FileWriter fw = new FileWriter("/home/studycat/Documents/Java/java/IO/out/h.txt");
		pro.store(fw, "abc");
		fw.close();
	}
	
	public static void function2() throws IOException {
		Properties pro = new Properties();
		FileReader fr = new FileReader("/home/studycat/Documents/Java/java/IO/out/h.txt");
		pro.load(fr);
		fr.close();
		System.out.println(pro);
	}
	
	public static void function() {
		Properties pro = new Properties();
		pro.setProperty("a", "1");
		pro.setProperty("b", "2");
		pro.setProperty("c", "3");
		System.out.println(pro);
		
		String value = pro.getProperty("c");
		System.out.println(value);
		
		Set<String> set = pro.stringPropertyNames();
		for (String key : set) {
			System.out.println(key + " " + pro.getProperty(key));
		}
	}

}
