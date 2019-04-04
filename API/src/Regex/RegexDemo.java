package Regex;

public class RegexDemo {
	public static void main(String[] args) {
		checkQQ();
		testSplit();
		testReplaceAll();
	}
	
	public static void checkQQ() {
		String QQ = "1234567";
		boolean b = QQ.matches("[1-9][\\d]{4,9}");
		System.out.println(b);
	}
	
	public static void testSplit() {
		String str = "12-34-56";
		String[] strArr = str.split("-");
		for (int i = 0; i < strArr.length; ++i)
			System.out.println(strArr[i]);
		
		String str2 = "ab  cd  ef  gh";
		String[] strArr2 = str2.split(" +");
		for (int i = 0; i < strArr2.length; ++i)
			System.out.println(strArr2[i]);
		
		String ip = "10.16.183.159";
		String[] ipArr = ip.split("\\.");
		for (int i = 0; i < ipArr.length; ++i)
			System.out.println(ipArr[i]);
	}
	
	public static void testReplaceAll() {
		String str = "Hello123World6789";
		String s = str.replaceAll("[\\d]+", "#");
		System.out.println(s);
	}
}
