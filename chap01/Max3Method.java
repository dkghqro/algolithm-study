package chap01;

public class Max3Method {
	
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max = d;		
		return max;
	}	
	
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		if (d < min)
			min = d;		
		return min;
	}
	
	public static void main(String[] args) {

		System.out.println("max4(3, 2, 1, 0)) = " + max4(3, 2, 1, 0));
		System.out.println("max4(1, 2, 3, 4)) = " + max4(1, 2, 3, 4));
		System.out.println("max4(4, 5, 6, 7)) = " + max4(4, 5, 6, 7 ));
		System.out.println("max4(-3, -2, -1, 0)) = " + max4(-3, -2, -1, 0) );
		System.out.println("\n");
		System.out.println("min4(3, 2, 1, 0)) = " + min4(3, 2, 1, 0));
		System.out.println("min4(1, 2, 3, 4)) = " + min4(1, 2, 3, 4));
		System.out.println("min4(4, 5, 6, 7)) = " + min4(4, 5, 6, 7 ));
		System.out.println("min4(-3, -2, -1, 0)) = " + min4(-3, -2, -1, 0));
				
	}

	
	
}
