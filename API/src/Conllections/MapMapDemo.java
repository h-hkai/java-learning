package Conllections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMapDemo {

	public static void main(String[] args) {
		HashMap<String, String> javase = new HashMap<String, String>();
		HashMap<String, String> javaee = new HashMap<String, String>();
		
		javaee.put("001", "A");
		javaee.put("002", "B");
		
		javase.put("001", "C");
		javase.put("002", "D");
		
		HashMap<String, HashMap<String, String>> itcast = 
				new HashMap<String, HashMap<String,String>>();
		itcast.put("Biasis", javaee);
		itcast.put("Employment", javase);
		
		Set<String> className = itcast.keySet();
		Iterator<String> it = className.iterator();
		while (it.hasNext()) {
			String classNameKey = it.next();
			HashMap<String, String> classMap = itcast.get(classNameKey);
			Set<String> studentNum = classMap.keySet();
			Iterator<String> studentIt = studentNum.iterator();
			while (studentIt.hasNext()) {
				String key = studentIt.next();
				System.out.println(classNameKey + " " + key + " " + classMap.get(key));
			}
		}
		
		System.out.println("=====");
		
		Set<Map.Entry<String, HashMap<String, String>>> classNameSet = 
				itcast.entrySet();
		Iterator<Map.Entry<String, HashMap<String, String>>> classNameIt = classNameSet.iterator();
		while(classNameIt.hasNext()) {
			Map.Entry<String, HashMap<String, String>> classNameEntry = classNameIt.next();
			String className2 = classNameEntry.getKey();
			System.out.println(className2 + " " + classNameEntry.getValue());	
			HashMap<String, String> classMap = classNameEntry.getValue();
			Set<Map.Entry<String, String>> studentSet = classMap.entrySet();
			Iterator<Map.Entry<String, String>> studentIt = studentSet.iterator();
			while (studentIt.hasNext()) {
				Map.Entry<String, String> studentEntry = studentIt.next();
				String numKey = studentEntry.getKey();
				String nameValue = studentEntry.getValue();
				System.out.println(className2 + " " + numKey + " " + nameValue);
			}
		}
	}

}














