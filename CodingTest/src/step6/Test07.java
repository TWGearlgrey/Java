package step6;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/04
 * 이름 : 한상민
 * 내용 : 1316. 그룹 단어 체커
 */
public class Test07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// 테스트 케이스 n 입력
		int n = in.nextInt();
		
		// 그룹단어 카운트 생성
		int count;

		// n만큼 문자열 입력
		for(int i=0 ; i<n ; i++) {
			String str = in.next();
			for(int j=0 ; j<str.length() ; j++) {
				int start = str.indexOf(String.valueOf(str.charAt(j)));
				int end   = str.lastIndexOf(String.valueOf(str.charAt(j)));
				
				String a = str.substring(start, end+1);
				String b = String.valueOf(str.charAt(j));
				
				for(int k=0 ; k<a.length() ; k++) {
					b = b.concat(String.valueOf(str.charAt(j)));
				}
				
				boolean result = b.equals(a);
				
			}
			
		}
	
		// 중복되는 글자수를 파악 후 그 글자수만큼 연속된 수가 있는지 확인하기.
		// substring(s, e)과 indexOf("e") lastIndexOf("e") 사용하기
	
	
	
	
	
	
		in.close();
	}
}
