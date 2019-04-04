package Object;

public class TestEquals {

	public static void main(String[] args) {
		Person p1 = new Person("Tom", 18);
		Person p2 = new Person("Jerry", 18);
		
		System.out.println(p1.equals(p2));

	}

}
