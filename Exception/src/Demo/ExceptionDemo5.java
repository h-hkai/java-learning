package Demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo5 {
	public static void main(String[] args) {
		try {
			function();
		} catch (ParseException e) {
			System.out.println(e);
		}
		
	}
	
	public static void function() throws ParseException {
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
		Date date = d.parse("2018-8-8");
		System.out.println(date);
	}
}


