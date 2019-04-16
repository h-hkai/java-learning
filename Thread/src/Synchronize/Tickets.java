package Synchronize;

public class Tickets implements Runnable {
	private static int tickets = 100;
	
//	StringBuffer
//	StringBuffer
	
	@Override
	public void run() {
		while (true) {
			pay();
		}
		
	}
	
// synchronized(Tickets.class) { }
	
	public static synchronized void pay() {
	
		if (tickets > 0) {
			
			try {					
				Thread.sleep(10);
			} catch (Exception e) {
					
			}
			System.out.println(Thread.currentThread().getName() + " " + tickets--);
		}
	}

}
