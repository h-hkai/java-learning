package SuperDemo2;

public class Test {
	public static void main(String[] args) {
		Worker w = new Worker("Tom", 10);
		Student s = new Student("Jerry", 8);
		System.out.println(w.getName() + " " + w.getAge());
		System.out.println(s.getName() + " " + s.getAge());
	}
}
