package chap01ex;

import java.util.Scanner;

public class Q10_Cipher {

	public static void main(String[] args) {

		try (Scanner stdIn = new Scanner(System.in)) {
			
			System.out.println("입력받은 정수의 자릿수를 출력합니다.");
			System.out.println("a : ");
			int a = stdIn.nextInt();
			
			while(a < 0)
			{
				System.out.println("양의 정수를 입력하세요.");
				System.out.println("a : ");
				a = stdIn.nextInt();
			}
			
			int length = Integer.toString(a).length();
			System.out.println("a의 자리수는 " + length + "입니다.");
		}
	}

}
