package Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Tickets implements Runnable {
	private int tickets = 100;
	
	private Lock lock = new ReentrantLock();

	@Override
	public void run() {
		while (true) {
			lock.lock();
			
			if (tickets > 0) {

				try {
					Thread.sleep(10);
					System.out.println(Thread.currentThread().getName() + " " + tickets--);
				} catch (Exception e) {

				} finally {
					lock.unlock();
				}
				
			}
			
		}
	}
}
