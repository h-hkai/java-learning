package extendsDemo;

public class test {

	public static void main(String[] args) {
		Develop d = new Develop();
		
		d.setName("Tom");
		d.work();
		d.print();
		
		Maintain m = new Maintain();
		m.setName("Jerry");
		m.work();
		m.print();
	}

}
