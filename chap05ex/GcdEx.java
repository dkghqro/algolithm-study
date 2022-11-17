package chap05ex;

import java.util.Scanner;

public class GcdEx {
	
	static int gcd(int x, int y) {
		
		while (true) {
			
			if (x > y)
			{
				x = x % y;
				if (x == 0) return y;
				if (y % x == 0) return x;
			}
			else if (y > x)
			{
				y = y % x;
				if (y == 0) return x;
				if (x % y == 0) return y;
			}
		}
			
	}
	
	static int gcdArray(int[] a, int length) {
		
		//a b c
		//60 48 50
		int min = a[0];
		
		// 모든 요소의 최소 공배수 찾기
		for (int j=1; j<length; j++)
		{
			int gcd = gcd(min, a[j]);
			if (gcd < min) min = gcd; 
		}
		return min;
	}

	public static void main(String[] args) {
		
		System.out.print("최소공배수를 구할 숫자 입력 (0 입력시 끝) :");
		Scanner stdIn = new Scanner(System.in);
		
		int[] a = new int[100];
		int ptr = 0;
		
		while(true)
		{
			var n = stdIn.nextInt();
			if (n == 0) 
				break;
			
			a[ptr] = n;
			ptr++;
		}
		
		int gcd = gcdArray(a, ptr);
		System.out.printf("GCD: %d", gcd);
	}
}
