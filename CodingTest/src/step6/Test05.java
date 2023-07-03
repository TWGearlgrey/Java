package step6;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/03
 * 이름 : 한상민
 * 내용 : 1157. 단어공부
 */
public class Test05 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String word = in.next();
		
		int[] counts = new int[26];
		char[] smallAlp = new char[26];
		char[] bigAlp   = new char[26];
		
		for(int i=0 ; i<26 ; i++) {
			bigAlp[i+65] = (char) (i + 65);
			smallAlp[i+97] = (char) (i + 97);
		}
		
		for(int i=0 ; i<26 ; i++) { // word값은 word길이만큼 반복 > spelling만큼 반복하게 수정할 것. i와 j사용
			if(word.charAt(i) == bigAlp[i] || word.charAt(i) == smallAlp[i] ) {
				counts[i]++;
			}
		}
		
		
		
	}
}
