package classDemo;

public class TestPhone_1 {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		
		Phone p2 = new Phone();
		
		p1.color = "white";
		p1.brand = "Xiaomi";
		p1.size = 4.5;
		
		p2.brand = "huawei";
		
		System.out.println(p1.brand);
		System.out.println(p2.brand);
	}
}
