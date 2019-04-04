package String;

public class StrngDemo2 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = "abc";
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
	}

}
