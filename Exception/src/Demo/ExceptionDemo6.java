package Demo;

public class ExceptionDemo6 {

	public static void main(String[] args) {
		Father f = new Son();
		try {
			f.function();
		} catch (Exception e) {
			
		}
	}

}


class Father {
	public void function() throws Exception {
		
	}
}

class Son extends Father {
	public void function() throws Exception {
		
	}
}
