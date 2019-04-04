package Date;

import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		Long time = System.currentTimeMillis();
		System.out.println(time);
		
		Date d2 = new Date(0);
		System.out.println(d2);
		
		Date d3 = new Date();
		Long l = d3.getTime();
		System.out.println(l);
		
		Date d4 = new Date();
		d4.setTime(0);
		System.out.println(d4);
	}
}

