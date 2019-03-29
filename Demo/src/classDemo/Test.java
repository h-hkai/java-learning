package classDemo;

public class Test {
	public static void main(String[] args) {
		RiceCooker r = new RiceCooker();
		r.brand = "tethla";
		r.color = "red";
		r.size = 30.0;
		
		System.out.println(r.brand + ' ' + r.color + ' ' + r.size);
		
		Car c = new Car();
		c.brand = "Audi";
		c.size = 30.0;
		c.type = "large";
		
		System.out.println(c.brand + ' ' + c.size + ' ' + c.type);
	}
}
