package programmers;

import java.math.BigInteger;

public class pro181846 {

	public static void main(String[] args) {
			String a = "18446744073709551615";
			String b = "287346502836570928366";
			String rs = "";
		 	BigInteger numA = new BigInteger(a);
	        BigInteger numB = new BigInteger(b);
	        
	        BigInteger sum = numA.add(numB);
	        
	       rs = sum.toString();

	       System.out.println(rs);
	}

}
