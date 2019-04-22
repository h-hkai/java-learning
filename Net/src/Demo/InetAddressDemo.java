package Demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		function();
//		function2();
	}
	
	public static void function2() throws UnknownHostException {
		InetAddress inet = InetAddress.getByName("www.baidu.com");
		System.out.println(inet);
	}
	
	public static void function() throws UnknownHostException {
		InetAddress inet = InetAddress.getLocalHost();
		System.out.println(inet);
		
		String ip = inet.getHostAddress();
		String name = inet.getHostName();
		System.out.println(ip + " " + name);
	}
}
