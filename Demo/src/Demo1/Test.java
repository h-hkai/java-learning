package Demo1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaEE j = new JavaEE("Tom", 22);
		Net n = new Net("Jerry", 23);
		
		System.out.println(j.getName() + " " + j.getAge());
		System.out.println(n.getName() + " " + n.getAge());
	}

}
