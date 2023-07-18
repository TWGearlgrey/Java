package confirm.ch04;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int acc = 0;		
		
		while(true) {
			System.out.println("+-------------------------------+");
			System.out.println("| 1.예금 | 2.출금 | 3.잔고 | 4.종료 |");
			System.out.println("+-------------------------------+");
			
			System.out.print("선택> ");
			int ch = sc.nextInt();
			
			if(ch == 1) {
				System.out.print("예금액>");
				int val1 = sc.nextInt();
				
				acc += val1;
				System.out.println(); //개행
				
			}else if(ch == 2) {
				System.out.print("출금액>");
				int val2 = sc.nextInt();
				
				acc -= val2;
				System.out.println(); //개행
				
			}else if(ch == 3) {
				System.out.println("잔고>" + acc);
				
			}else if(ch == 4) {
				System.out.println("프로그램 종료");
				break;
				
			}
		}
		sc.close();
	}
}
