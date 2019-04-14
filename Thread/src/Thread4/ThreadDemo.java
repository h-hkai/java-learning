package Thread4;

public class ThreadDemo {

	public static void main(String[] args) {
		new Thread() {
			public void run() {
				System.out.println("111");
			}
		}.start();
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("222");
				
			}
		};
		
		new Thread(r).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("333");
				
			}
		}).start();

	}

}
