package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSend {
	public static void main(String[] args) throws IOException {
		
		byte[] date = "Hello UDP".getBytes();
		InetAddress inet = InetAddress.getByName("127.0.0.1");
		DatagramPacket dp = new DatagramPacket(date, date.length, inet, 6000);

		DatagramSocket ds = new DatagramSocket();
		ds.send(dp);

		ds.close();

	}
}
