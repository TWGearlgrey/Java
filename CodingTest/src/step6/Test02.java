package step6;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/29
 * 이름 : 한상민
 * 내용 : 3003. 킹, 퀸, 룩, 비숍, 나이트, 폰
 */
public class Test02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String ch = in.nextLine();
		
		for ( int i=0 ; i<11 ; i++ ) {
			System.out.print(ch.charAt(i));
		}
		
		// (증감값) = (입력값)-1 ~~> 킹1개 = (입력값) - (증감값)
		
	}
}
