package Calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
//		System.out.println(c);
		
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		
		c.set(Calendar.MONTH, 9);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		
		c.set(2099, 5, 1);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		
		c.add(Calendar.DAY_OF_YEAR, 20);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		
		Date date = c.getTime();
		System.out.println(date);
	}
}
