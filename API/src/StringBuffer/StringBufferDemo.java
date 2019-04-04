package StringBuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		function();
	}
	
	public static void function() {
		StringBuffer buffer = new StringBuffer();
		
		buffer.append(6).append(false).append("Tom");
		System.out.println(buffer);
		
		buffer.delete(3, 4);
		System.out.println(buffer);
		
		buffer.delete(0, buffer.length());
		System.out.println(buffer);
		
		buffer.append("append");
		buffer.insert(3, 9);
		System.out.println(buffer);
		
		buffer.replace(1, 4, "Q");
		System.out.println(buffer);
		
		buffer.reverse();
		System.out.println(buffer);
		
		buffer.append(1357);
		String s = buffer.toString();
		System.out.println(s);
	}

}
