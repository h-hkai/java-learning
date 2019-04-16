package Security;

public class Tickets implements Runnable {
	private int tickets = 100;
	private Object obj = new Object();
	
	@Override
	public void run() {
		while (true) {
			
			synchronized (obj) {
				if (tickets > 0) {
					
					try {
						Thread.sleep(10);
					} catch (Exception e) {
						
					}
					System.out.println(Thread.currentThread().getName() + " " + tickets--);
				} else break;
			}

		}
		
	}
}
