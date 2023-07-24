package step12;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/24
 * 이름 : 한상민
 * 내용 : 1018. 제목
 */
public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//가로, 세로 지정
		int m = sc.nextInt(); 
		int n = sc.nextInt(); 
		
		//체스판 생성
		char[][] board = new char[m][n];
		
		for(int i=0 ; i<m ; i++) {
			for(int j=0 ; j<n ; j++) {
				String bw = sc.next();
				board[i][j] = bw.charAt(j);
			}
		}
		
		//좌측상단기준 시작 기준점설정 (0부터 m-8, n-8이 시작 마지노선)
		//시작 기준점이 B인지 W인지 확인 ~> 별로 안중요한거같음
		//BWcnt, WBcnt
	}
}
