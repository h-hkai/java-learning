package Thread2;

public class ThreadDemo2 {
	public static void main(String[] args) throws InterruptedException {
//		for (int i = 0; i < 5; ++i) {
//			Thread.sleep(1000);
//			System.out.println(i);
//		}
		new SleepThread().start();
	}
}
