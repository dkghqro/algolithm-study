package chap05ex;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialEx {

	public static BigInteger factorial(int n) {
		
		BigInteger mul = BigInteger.valueOf(1);
		
		for (int i=1; i<=n; i++)
		{
			mul = mul.multiply(BigInteger.valueOf(i));
		}
		return mul;
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("팩토리얼(?) : ");
		var n = stdIn.nextInt();
		
		BigInteger sum = factorial(n);
		System.out.println("결과 : " + sum);
	}
}
