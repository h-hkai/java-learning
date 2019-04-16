package Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		es.submit(new TheardPoolRunnable());
		es.submit(new TheardPoolRunnable());
		es.submit(new TheardPoolRunnable());
		
//		es.shutdown();
		
	}
}
