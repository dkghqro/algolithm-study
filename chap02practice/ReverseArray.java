package chap02practice;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sortProc();
		
		int[] a = new int[7];
		int[] b = new int[] {2, 5, 1, 3, 9, 6, 7};
		
		System.out.println(sumOf(b));
		
		copyReverse(a,b);
		System.out.println(Arrays.toString(a));
	
	}

	static void sortProc() {
		
		int[] a = new int[] {2, 5, 1, 3, 9, 6, 7};
		int temp;
		System.out.println(Arrays.toString(a));
		
		System.out.println("a[0]과 a[6]를 교환합니다.");
		temp = a[0];
		a[0] = a[6];
		a[6] = temp;
		System.out.println(Arrays.toString(a));
		
		
		System.out.println("a[1]과 a[5]를 교환합니다.");
		temp = a[1];
		a[1] = a[5];
		a[5] = temp;
		System.out.println(Arrays.toString(a));
		
		System.out.println("a[2]과 a[4]를 교환합니다.");
		temp = a[2];
		a[2] = a[4];
		a[4] = temp;
		System.out.println(Arrays.toString(a));
		
	}
	
	static int sumOf(int[] a) {

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	static void copy(int[] a, int[] b) {
		for (int i=0; i<a.length; i++) {
			a[i] = b[i];
		}
	}
	
	static void copyReverse(int[] a, int[] b) {
		
		int j = a.length - 1;
		for (int i=0; i<a.length; i++) {
			a[i] = b[j];
			j--;
		}
	}	
}
