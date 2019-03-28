package classDemo;

public class testPhone {
	public static void main(String[] args) {
		Phone p = new Phone();
//		System.out.println(p);
		
		p.color = "red";
		p.brand = "apple";
		p.size = 16.0;
		
		System.out.println(p.color + ' ' + p.size);
		
		return;
	}
}
