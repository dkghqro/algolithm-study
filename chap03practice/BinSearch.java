package chap03practice;

import java.util.Scanner;

public class BinSearch {
	
	static int binSearch(int[] a, int n, int key) {
        
		int i=0;
        // 헤더 출력
        System.out.print("   |");
        for (i=0; i<a.length; i++)
        {
        	System.out.printf("%2d", i);
        }
        System.out.println();
        System.out.print("---+");
        for (i=0; i<a.length; i++)
        {
        	System.out.print("--");
        }
        System.out.print("\n");
        
	}
	
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num + 1];                        // 요솟수가 num + 1인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색 값 : ");                    // 키값을 읽력받음
        int ky = stdIn.nextInt();
//
//        int idx = seqSearchSen(x, num, ky);              // 배열 x에서 값이 ky인 요소를 검색
//
//        if (idx == -1 || idx == num)
//            System.out.println("검색 값의 요소가 없습니다.");
//        else
//            System.out.println("검색 값은 x[" + idx + "]에 있습니다.");
//        
//        int[] idx = new int[num + 1];   
//        var size = searchIdx(x, num, ky, idx); 
//        System.out.println("일치값 " + size + "개");
    }
    
}
