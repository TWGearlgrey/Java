package sub1;

import java.util.Scanner;

public class No02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// 정수 n 입력
		int n = in.nextInt();
		
		// 피라미드 별 생성
		for (int i=0; i<n ; i++) {
			// 1 ~ n-1-i 번째까지 ☆ 생성
			for (int j=1 ; j<n-i ; j++) {
				System.out.print("☆");
			}

			// n-i ~ n+i 번째까지 ★ 생성
			for (int j=n-i ; j<=n+i ; j++) {
				System.out.print("★");
			}
			
			// n+1+i ~ 2n-1 번째까지 ☆ 생성
			for (int j=n+1+i ; j<2*n ; j++) {
				System.out.print("☆");
			}
			
			System.out.print("\n"); // 개행
		}
		
		in.close();
	}
}




