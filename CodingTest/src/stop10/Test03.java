package stop10;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/13
 * 이름 : 한상민
 * 내용 : 3009. 네 번째 점
 */
public class Test03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] point = new int[3][2];
		
		// 배열 생성
		for(int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<2 ; j++) {
				point[i][j] = sc.nextInt();
			}
		}
		/** ~~> 최대로는 구할 수 없음
		// 각 요소 최대값 구하기
		for(int j=0 ; j<2 ; j++) {
			int max = 0;
			for(int i=0 ; i<3 ; i++) {
				if(max < point[i][j]) {
					max = point[i][j];
				}
			}
			System.out.print(max + " ");
		}
		*/
	}
}
