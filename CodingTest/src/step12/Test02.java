package step12;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/21
 * 이름 : 한상민
 * 내용 : 2231. 분해합
 */
public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int len = n.length();
		
		// String + (s1 .. sn) == n
		int min = 0;

		// 1. 글자수로 필터링해서 탐색 범위를 좁히기
		// 2. 가장 큰 수부터 비교 시작하기
		// 3. 
		
		// 216~~~
		// 198 => 198 + 1 + 9 + 8 = 216
		// 199 => 199 + 1 + 9 + 9 = 218
		// 200 => 200 + 2 + 0 + 0 = 202
	}
}
