package chap04ex;

// int형 고정 길이 큐의 사용 예

import java.util.Scanner;

class IntQueueTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        IntQueue s = new IntQueue(12);
        //s.setPosition(7);
        
        while (true) {
        	System.out.println(" "); // 메뉴 구분을 위한 빈 행 추가
            System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
            System.out.print("(1)인큐　(2)디큐　(3)피크　(4)덤프　(5)indexOf　(6)search　(7)인덱스 변경  (0)종료: ");

            int menu = stdIn.nextInt();
            if (menu == 0) break;

            int x;
            switch (menu) {
             case 1:                                // 인큐
                System.out.print("데이터: ");
                x = stdIn.nextInt();
                try {
                    s.enque(x);
                 } catch (IntQueue.OverflowIntQueueException e) {
                    System.out.println("큐가 가득 찼습니다.");
                }
                break;

             case 2:                                // 디큐
                try {
                     x = s.deque();
                    System.out.println("디큐한 데이터는 " + x + "입니다.");
                 } catch (IntQueue.EmptyIntQueueException e) {
                    System.out.println("큐가 비어 있습니다.");
                }
                break;

             case 3:                                // 피크
                try {
                     x = s.peek();
                    System.out.println("피크한 데이터는 " + x + "입니다.");
                 } catch (IntQueue.EmptyIntQueueException e) {
                    System.out.println("큐가 비어 있습니다.");
                }
                break;

             case 4:                                // 덤프
                s.dump();
                break;
                
             case 5: 								// indexOf
				 System.out.print("데이터: ");
				 x = stdIn.nextInt();            	 
				 int r = s.indexOf(x);
				 System.out.println(r);
				 break;
				 
             case 6: 								// search
                 System.out.print("데이터: ");
                 x = stdIn.nextInt();            	 
            	 int idx = s.search(x);
            	 System.out.println(idx);
            	 break;
            	 
             case 7:
                 System.out.print("인덱스: ");
                 x = stdIn.nextInt();              	 
            	 int pos = s.setPosition(x);
            	 if (pos == -1)
            		 System.out.println("인덱스 변경 실패" );
            	 else
            		 System.out.println("인덱스 변경 성공: " + pos);
            	 break;
            }
        }
    }
}