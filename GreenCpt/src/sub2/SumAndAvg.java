package sub2;

import java.util.Scanner;

public class SumAndAvg {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		
		// 0을 입력받을 때까지 정수 입력
		while(true) {
			System.out.print("정수를 입력하세요:");
			int n = in.nextInt();
			
			// 0일때 while문 종료
			if(n==0) {
				break;
			} else { 
				// 0이 아닐때 합계와 정수의 갯수 카운트
				sum+=n; count++; 
			}
		}
		
		//출력
		System.out.println("합계는 " + sum + "입니다. 평균은 " + sum/count + "입니다.");

		in.close();
	}
}