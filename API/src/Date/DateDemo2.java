package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {

	public static void main(String[] args) throws Exception {
		fun();
		fun2();
	}
	
	public static void fun() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		String s = sdf.format(new Date());
		System.out.println(s);
	}
	
	public static void fun2() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse("1995-5-6");
		System.out.println(date);
	}

}
