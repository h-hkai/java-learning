package TCPImgUpload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Random;

public class Upload implements Runnable {
	
	private Socket socket;
	
	public Upload(Socket socket) {this.socket = socket;}
	
	public void run() {
		
		try {
			InputStream in = socket.getInputStream();
			
			File upload = new File("/home/studycat/Documents/Java/java/Net/upload");
			if (!upload.exists()) upload.mkdirs();
			
			String filename = "cute" + System.currentTimeMillis() + new Random().nextInt(999999) + ".png";
			
			FileOutputStream fos = new FileOutputStream(upload + File.separator + filename);
			byte[] bytes = new byte[1024];
			
			int len = 0;
			while ((len = in.read(bytes)) != -1) {
				fos.write(bytes, 0, len);
			}
			
			socket.getOutputStream().write("upload successfully.".getBytes());
			
			fos.close();
			socket.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
}
