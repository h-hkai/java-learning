package BigInteger;

import java.math.BigInteger;

public class BigIntegerDemo {

	public static void main(String[] args) {
		BigInteger b = new BigInteger("12345678654333333333333333333333333333333333333");
		System.out.println(b);
		BigInteger b2 = new BigInteger("1111111111111111111155555555555555555888888888888888332");
		System.out.println(b2);
		
		BigInteger bigAdd = b.add(b2);
		System.out.println(bigAdd);
		
		BigInteger bigSub = b.subtract(b2);
		System.out.println(bigSub);
		
		BigInteger bigMul = b.multiply(b2);
		System.out.println(bigMul);
		
		BigInteger bigDiv = b2.divide(b);
		System.out.println(bigDiv);
		
		
	}

}
