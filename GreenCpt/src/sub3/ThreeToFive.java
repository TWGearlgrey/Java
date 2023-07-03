package sub3;

import java.util.Scanner;

public class ThreeToFive {
	public static void main(String[] args) {
		
		// 2개의 정수를 입력
		Scanner in = new Scanner(System.in);

		System.out.print("숫자입력:");
		int n = in.nextInt();
		
		System.out.print("숫자입력:");
		int m = in.nextInt();
		
		// 정수의 크기 비교를 위한 변수 생성 및 크기 비교
		int start = 0;
		int end   = 0;
		int sum   = 0;
		
		if( n > m ) {
			start = m; 
			end = n;
		} else {
			start = n; 
			end = m;
		}
		
		// start부터 end까지의 숫자 나열 및 합계 출력
		System.out.print("결과:");
		for(int i=start ; i<=end ; i++) {
			if(i<end) {
				System.out.print(i + ",");
			} else {
				System.out.println(i);
			}
			sum+=i;
		}

		System.out.print("합계:" + sum);
		
		in.close();
	}
}
