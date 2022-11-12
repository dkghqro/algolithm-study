package chap02practice;

import java.util.Scanner;

public class DecConv {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		char[] cno = new char[32];
		String dChar = "0123456789";
		
		System.out.println("10진수를 기수 변환합니다.");
		System.out.println("변환하는 음이 아닌 정수: ");
		int target = stdIn.nextInt();
		
		System.out.println("어떤 진수로 변환할까요?(2~36)");
		
		int jinsu = stdIn.nextInt();

		for (int i = 0; target > 0; i++) {
			System.out.print(jinsu + "|" + String.format("%8d", target));
			
			if (i > 0) 
				System.out.print(" ... " + cno[i-1]);
			
			System.out.println("");
			System.out.println("+--------");

			int remain = target % jinsu;
			cno[i] = dChar.charAt(remain);
			target = target / jinsu;
			

		}
	}

}
