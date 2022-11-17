package chap01ex;

import java.util.Scanner;

public class SumGaus {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("1부터 n까지 정수의 합을 구합니다.");
			System.out.println("n값 : ");
			int n = scan.nextInt();
			
			int sum = (1 + n) * 5;
			System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		}

	}

}
