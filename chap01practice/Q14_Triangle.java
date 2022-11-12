package chap01practice;

public class Q14_Triangle {

	public static void main(String[] args) {

		//triangleLB(5);
		//triangleLT(5);
		//triangleRT(5);
		//triangleRB(5);
		//spira(15);
		npira(9);
	}

	// 왼쪽 아래가 직각인 이등변삼각형
	static void triangleLB(int n) {
		
		for (int j = 1; j <= n; j++) {
			
			for (int i = 0; i < j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 왼쪽 위가 직각인 이등변삼각형
	static void triangleLT(int n) {
		
		for (int j = n; j > 0; j--) {
			
			for (int i = 0; i < j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 오른쪽 위가 직각인 이등변삼각형
	static void triangleRT(int n) {
		
		for (int j = n; j > 0; j--) {
			
			System.out.print(String.format("%5s", "*".repeat(j)));
			System.out.println();
		}
	}
	
	// 오른쪽 아래가 직각인 이등변삼각형
	static void triangleRB(int n) {
		
		for (int j = 1; j <= 5; j++) {
			
			System.out.print(String.format("%5s", "*".repeat(j)));
			System.out.println();
		}
	}	
	
	// 피라미드
	static void spira(int n) {
		//"    *    "
		//"   ***   "
		//"  *****  "
		//" ******* "
		//"*********"
		
		// i : 1 2 3 4 5
		// * : 1 3 5 7 9
		// "": 8 6 4 2 0
		
		for (int i = 1; i <= n; i++) {
			
			int s = (i * 2) - 1;
			int e = (n * 2 - 1) - s;
			
			System.out.print(" ".repeat(e/2));
			System.out.print("*".repeat(s));
			System.out.print(" ".repeat(e/2));
			System.out.println();
		}
	}
	
	// 숫자 피라미드
	static void npira(int n) {
		
	if (n > 9)
	{
		System.out.println("최대 9까지 표시 가능합니다.");
		return;
	}
		
		for (int i = 1; i <= n; i++) {
			
			int s = (i * 2) - 1;
			int e = (n * 2 - 1) - s;
			
			System.out.print(" ".repeat(e/2));
			System.out.print(Integer.toString(i).repeat(s));
			System.out.print(" ".repeat(e/2));
			System.out.println();
		}
	}
	
	
}
