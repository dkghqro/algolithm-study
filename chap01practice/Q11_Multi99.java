package chap01practice;

public class Q11_Multi99 {

	public static void main(String[] args) {

		//multiMethod(1, 10);
		//addMethod(1, 10);
		printSqare();
	}
	
	static void multiMethod(int i, int j) {

		System.out.print("   |");

		// 헤더
		for (i = 1; i < 10; i++)
			System.out.print(String.format("%3s", i));
		
		
		System.out.println("");
		System.out.println("---+---------------------------");
		
		// 메인
		for (i = 1; i < 10; i++) {
			System.out.print(" " + i + " |");
			
			for (j = 1; j < 10; j++) {
				int multi = j * i;
				System.out.print(String.format("%3s", Integer.toString(multi)));		
			}
			System.out.println("");
		}
	}

	static void addMethod(int i, int j) {
		
		System.out.print("   |");

		// 헤더
		for (i = 1; i < 10; i++)
			System.out.print(String.format("%3s", i));
		
		
		System.out.println("");
		System.out.println("---+---------------------------");
		
		// 메인
		for (i = 1; i < 10; i++) {
			System.out.print(" " + i + " |");
			
			for (j = 1; j < 10; j++) {
				int sum = j + i;
				System.out.print(String.format("%3s", Integer.toString(sum)));		
			}
			System.out.println("");
		}
		
	}
	
	static void printSqare() {
		
		for (int j = 0; j < 5; j++) {
			
			for (int i = 0; i < 5; i++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
