package String;

public class StringDemo3 {
	public static void main(String[] args) {
		fun1();
		fun2();
	}
	
	public static void fun1() {
		byte[] bytes = {98, 99, 100};
		String s = new String(bytes);
		System.out.println(s);
		
		byte[] bytes1 = {65, 66, 67, 68, 69};
		String s1 = new String(bytes1, 1, 2);
		System.out.println(s1);
	}
	
	public static void fun2() {
		char[] ch = {'a', 'b', 'c', 'd'};
		String s = new String(ch);
		System.out.println(s);
	}
}

