package sub1;

import java.util.Scanner;

public class No01 {
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		
		// 정수 n 입력
		int n = in.nextInt();
		
		// 별 모양 생성 
		for (int i=1 ; i<=n ; i++) {
			
			// n-i번만큼 " "를 출력하기
			for (int k=n-i ; k>0 ; k--) {
				System.out.print(" ");
			}
			
			// i번 만큼 "*" 출력하기
			for (int k=0 ; k<i ; k++) {
				System.out.print("*");
			}
			System.out.print("\n"); // 개행
		}
		
		in.close();
	}
}
