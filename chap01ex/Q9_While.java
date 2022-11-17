package chap01ex;

import java.util.Scanner;

public class Q9_While {
	public static void main(String[] args) {
		
		try (Scanner stdIn = new Scanner(System.in)) {
			System.out.println("a값 : ");
			int a = stdIn.nextInt();
			System.out.println("b값 : ");
			int b = stdIn.nextInt();
			
			while (a >= b)
			{
				System.out.println("a보다 큰 값을 입력하세요.");
				System.out.println("b값 : ");
				b = stdIn.nextInt();			
			}
			
		}

	}
}
