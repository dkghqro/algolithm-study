package chap03ex;

import java.util.Scanner;

public class BinSearch {
	
	static int binSearch(int[] a, int n, int key) {
        
		int i=0;
		int leftIdx = 0;
		int rightIdx = a.length - 1;
		int centerIdx = (leftIdx + rightIdx) / 2;
		boolean match = false;
		
		// 헤더 출력
        System.out.print("   |");
        for (i=0; i<a.length; i++) {
        	System.out.printf("%2d", i);
        }
        System.out.println();
        System.out.print("---+");
        for (i=0; i<a.length; i++) {
        	System.out.print("--");
        }
        System.out.print("\n");

        while (centerIdx > 0 && leftIdx != centerIdx && rightIdx != centerIdx)
        {
        	// 라인1
        	System.out.print("   |");
        	for (int j=0; j<a.length; j++) {
        		
        		if (j == leftIdx) 
        			System.out.print("<-");
        		else if (j == centerIdx)
        			System.out.printf("%2s", "+");
        		else if (j == rightIdx)
        			System.out.print("->");
        		else 
        			System.out.print("  ");
        	}
        	System.out.print("\n");
        	
            // 라인2        	
        	System.out.printf("%3d", centerIdx);
        	System.out.print("|");
        	for (int k=0; k<a.length; k++) {
        		System.out.printf("%2d", a[k]);
        	}
        	System.out.print("\n");

        	// 라인3
        	System.out.print("   |");
        	System.out.print("\n");   
        	
        	// 검색 성공
            if (a[centerIdx] == key)   
            {
            	match = true;
                break;
            }
            else {
            	
            	if (a[centerIdx] < key) {
            		rightIdx = centerIdx;
            		centerIdx = (leftIdx + rightIdx) / 2;
            	}
            	else if (a[centerIdx] > key)
            	{
            		leftIdx = centerIdx;
            		centerIdx =  (leftIdx + rightIdx) / 2;            		
            	}
            		
            }
            
        }
        
        // 같은 요소가 있는지 체크 후 가장 앞의 요소를 반환
        while(centerIdx > 0 && a[centerIdx] == a[centerIdx-1])
        {
        	centerIdx = centerIdx-1;
        }
        
        if (match) System.out.print(a[centerIdx] + "[" + centerIdx + "]를 찾았습니다.");
        else System.out.print(a[centerIdx] + "검색에 실패했습니다.");
        
        return a[centerIdx];
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
        
        binSearch(x, num, ky);
    }
    
}
