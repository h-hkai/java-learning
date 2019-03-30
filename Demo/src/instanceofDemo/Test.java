package instanceofDemo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Student();
		Person p2 = new Teacher();
		p1.sleep();
		p2.sleep();
		
		boolean b = p1 instanceof Animal;
		System.out.println(b);

	}

}
