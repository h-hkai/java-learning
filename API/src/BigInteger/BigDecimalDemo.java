package BigInteger;

import java.math.BigDecimal;

public class BigDecimalDemo {

	public static void main(String[] args) {
		System.out.println(0.09 + 0.01);
		System.out.println(1.0 - 0.32);
		System.out.println(1.015 * 100);
		System.out.println(1.301 / 100);
		
		BigDecimal bd1 = new BigDecimal("0.09");
		BigDecimal bd2 = new BigDecimal("0.01");
		BigDecimal bigAdd = bd1.add(bd2);
		System.out.println(bigAdd);
		
		BigDecimal bd3 = new BigDecimal("1.0");
		BigDecimal bd4 = new BigDecimal("0.32");
		BigDecimal bigSub = bd3.subtract(bd4);
		System.out.println(bigSub);

		BigDecimal bd5 = new BigDecimal("1.015");
		BigDecimal bd6 = new BigDecimal("100");
		BigDecimal bigMul = bd5.multiply(bd6);
		System.out.println(bigMul);
		
		BigDecimal bd7 = new BigDecimal("1.301");
		BigDecimal bd8 = new BigDecimal("100");
		BigDecimal bigDiv = bd7.divide(bd8, 2, BigDecimal.ROUND_HALF_UP);
		System.out.println(bigDiv);
	}

}
