package confirm.ch05;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] score = {};
		
		while(true) {
			System.out.println("+-----------------------------------------------+");
			System.out.println("| 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 |");
			System.out.println("+-----------------------------------------------+");
			System.out.print("선택> ");
			int ch = Integer.parseInt(sc.nextLine());
			
			if(ch == 1) {
				System.out.print("학생수> ");
				int c = Integer.parseInt(sc.nextLine());
				score = new int[c];
				
				
			}else if(ch == 2) {
				for(int i=0 ; i<score.length ; i++) {
					System.out.printf("score[%d]> ", i);
					score[i] = Integer.parseInt(sc.nextLine());
				}

				
			}else if(ch == 3) {
				for(int i=0 ; i<score.length ; i++) {
					System.out.printf("score[%d]> " + score[i], i);
					System.out.print("\n");
				}
				
				
			}else if(ch == 4) {
				
				double avg = 0;
				int    max = 0;
				
				for(int i=0 ; i<score.length ; i++) {
					avg += score[i];
					if(max < score[i]) {
						max = score[i];
					}
				}
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg/score.length);
			
				
			}else if(ch == 5) {
				System.out.println("프로그램 종료");
				break;
			}
			
			
		}
		sc.close();
	}
}
