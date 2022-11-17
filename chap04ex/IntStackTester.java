package chap04ex;

// int형 고정 길이 스택의 사용 예

import java.util.Scanner;

import chap04.IntStack;
import chap04.IntStack.EmptyIntStackException;
import chap04.IntStack.OverflowIntStackException;

class IntStackTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        IntStack s = new IntStack(64);    // 최대 64 개를 푸시할 수 있는 스택

        while (true) {
        	System.out.println(); // 메뉴 구분을 위한 빈 행 추가
            System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
            System.out.print("(1)푸시　(2)팝　(3)피크　(4)덤프　(5)IndexOf (6)Size (7)isEmpty (0)종료: ");

            int menu = stdIn.nextInt();
            if (menu == 0) break;

            int x;
            switch (menu) {
             case 1:                                // 푸시
                System.out.print("데이터: ");
                x = stdIn.nextInt();
                try {
                    s.push(x);
                 } catch (IntStack.OverflowIntStackException e) {
                    System.out.println("스택이 가득 찼습니다.");
                }
                break;

             case 2:                                // 팝
                try {
                     x = s.pop();
                    System.out.println("팝한 데이터는 " + x + "입니다.");
                 } catch (IntStack.EmptyIntStackException e) {
                    System.out.println("스택이 비어있습니다.");
                }
                break;

             case 3:                                // 피크
                try {
                     x = s.peek();
                    System.out.println("피크한 데이터는 " + x + "입니다.");
                 } catch (IntStack.EmptyIntStackException e) {
                    System.out.println("스택이 비어있습니다.");
                }
                break;

             case 4:                                // 덤프
                s.dump();
                break;
                
             case 5: 								// IndexOf
            	System.out.println("확인할 인덱스 : ");
            	
            	int y = stdIn.nextInt();
            	int val = s.indexOf(y);
            	System.out.println(val + "는 s[" + y + "]은 " + "에 있습니다.");
            	break;
            	
             case 6:
            	System.out.println("입력된 데이터는 " + s.size() + "개 입니다.");
            	break;
            	
             case 7:
            	System.out.println("배열이 비어있나요? -> " + (s.isEmpty() ? "예" : "아니오"));
            	break;
            	
            	
            }
        }
    }
}