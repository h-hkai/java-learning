package Regex;

public class CheckEmail {

	public static void main(String[] args) {
		checkMail();
	}
	
	public static void checkMail() {
		String email = "1376253264@qq.com.cn";
		boolean b = email.matches("[a-zA-Z0-9_]+@[0-9a-z]+(\\.[a-z]+)+");
		System.out.println(b);
	}

}
