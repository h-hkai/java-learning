package Thread2;

public class ThreadDemo {

	public static void main(String[] args) {
		NameThread nt = new NameThread();
//		nt.setName("myThread.");
		nt.start();
		
		System.out.println(Thread.currentThread().getName());
	}

}
