package WaitNotifyDemo;

public class Output implements Runnable {

	private Resource r = new Resource();
	
	public Output(Resource r2) {
		this.r = r2;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (r) {
				if (!r.flag) {
					try {
						r.wait();
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				System.out.println(r.name + " " + r.gender);
				
				r.flag = true;
				r.notify();
			}
		}
		
	}

}
