package chap01ex;

import java.util.Scanner;

public class Sumof {

	public static void main(String[] args) {
		
		try (Scanner stdIn = new Scanner(System.in)) {
			System.out.println("정수 a, b 사이의 모든 정수의 합을 구합니다.");
			System.out.println("정수 a: ");
			int a = stdIn.nextInt();
			System.out.println("정수 b: ");
			int b = stdIn.nextInt();
			
			int sum = (a + b) * 5;
			System.out.println("정수 " + a + "," + b + "사이의 모든 합은 " + sum + "입니다.");
		}
		
		
	}

}
