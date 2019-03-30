package extendsDemo3;

public class TestPhone {

	public static void main(String[] args) {
		Phone p = new Phone();
		p.call();
		p.sendMessage();
		p.showNum();
		
		AndroidPhone ap = new AndroidPhone();
		ap.showNum();
	}

}
