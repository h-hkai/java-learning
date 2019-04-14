package Thread2;

public class SleepThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; ++i) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
