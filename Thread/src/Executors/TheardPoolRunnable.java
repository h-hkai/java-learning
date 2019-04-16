package Executors;

public class TheardPoolRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " run ....");
		
	}
	
}
