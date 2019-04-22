package TCPImgUpload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1", 8888);
		
		OutputStream out = socket.getOutputStream();
		
		FileInputStream fis = new FileInputStream("/home/studycat/Pictures/cute.png");
		
		int len = 0;
		byte[] bytes = new byte[1024];
		
		while ((len = fis.read(bytes)) != -1) {
			out.write(bytes, 0, len);
		}
		
		socket.shutdownOutput();
		
		InputStream in = socket.getInputStream();
		len = in.read(bytes);
		
		System.out.println(new String(bytes, 0, len));
		
		fis.close();
		socket.close();
	}
}
