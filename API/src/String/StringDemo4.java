package String;

public class StringDemo4 {

	public static void main(String[] args) {
		String str = new String("hello word");
		String str2 = new String("Hello Word");
		
		int len = str.length();
		String sub = str.substring(2);
		String sub2 = str.substring(2, 9);
		boolean b = str.endsWith("coding!");
		boolean c = str.contains("ll");
		int d = str.indexOf('m');
		byte[] bytes = str.getBytes();
		char[] ch = str.toCharArray();
		boolean b1 = str.equals(str2);
		boolean b2 = str.equalsIgnoreCase(str2);
		
		for (int i = 0; i < bytes.length; ++i)
			System.out.print(bytes[i]);
		System.out.println();
		
		for (int i = 0; i < ch.length; ++i) 
			System.out.print(ch[i]);
		System.out.println();
		
		
		
		System.out.println(len + " " + sub + " " + sub2 + " " + b + " " + c);
		System.out.println(d + " " + b1 + " " + b2);
	}

}
