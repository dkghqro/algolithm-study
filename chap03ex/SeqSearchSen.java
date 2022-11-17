package chap03ex;

import java.util.ArrayList;

// 선형 검색(보초법)

import java.util.Scanner;

class SeqSearchSen {
    //--- 요솟수가 n인 배열 a에서 key와 값이 같은 요소를 보초법으로 선형 검색 ---//
    static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;

        a[n] = key;             // 보초를 추가

//        while (true) {
//            if (a[i] == key)    // 검색 성공
//                break;
//            i++;
//        }
        
        // 헤더 출력
        System.out.print("   |");
        for (i = 0; i<a.length; i++)
        {
        	System.out.printf("%2d", i);
        }
        System.out.println();
        System.out.print("---+");
        for (i = 0; i<a.length; i++)
        {
        	System.out.print("--");
        }
        System.out.print("\n");
        
        for (i = 0; i<a.length; i++) {
            
        	// 라인1
        	System.out.print("   |");
        	for (int j=0; j<a.length; j++)
        	{
        		if (i == j) System.out.print(" *");
        		else System.out.print("  ");
        	}
        	System.out.print("\n");
        	
            // 라인2        	
        	System.out.printf("%3d", i);
        	System.out.print("|");
        	for (int k=0; k<a.length; k++)
        	{
        		System.out.printf("%2d", a[k]);
        	}
        	System.out.print("\n");

        	// 라인3
        	System.out.print("   |");
        	System.out.print("\n");   
        	
            if (a[i] == key)    // 검색 성공
                break;
        }
        
        return i == n ? -1 : i;
    }

    static int searchIdx(int[] a, int n, int key, int[] idx) {
    	
    	int j=0;
    	for (int i=0; i<a.length; i++) {
    		if (a[i]==key)
    		{
    			idx[j] = i;
    			j++;
    		}
    	}
    	return j;
    	
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
        int[] idx = new int[num + 1];   
        var size = searchIdx(x, num, ky, idx); 
        System.out.println("일치값 " + size + "개");
    }
}