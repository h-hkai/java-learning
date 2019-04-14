package Stream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//function();
		function2();
	}
	
	public static void function2() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("/home/studycat/Documents/Java/java/IO/out/g.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o = ois.readObject();
		System.out.println(o.toString());
		ois.close();
	}
	
	public static void function() throws IOException {
		FileOutputStream fos = new FileOutputStream("/home/studycat/Documents/Java/java/IO/out/g.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Persion p = new Persion("Tom", 25);
		oos.writeObject(p);
		oos.close();
	}

}
