package WaitNotifyDemo;

public class Input implements Runnable {

	private Resource r = new Resource();
	
	
	public Input(Resource r2) {
		this.r = r2;
	}


	@Override
	public void run() {
		int i = 0;
		
		while (true) {
			synchronized (r) {
				if (r.flag) {
					try{r.wait();}catch (Exception e) { }
				}
				
				if (i % 2 == 0) {
					r.name = "Tom";
					r.gender = "male";
				} else {
					r.name = "Mario";
					r.gender = "female";
				}
				r.flag = true;
				r.notify();
			}
			i++;
		}
		
	}

}
