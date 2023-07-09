package step8;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 날짜 : 2023/07/07
 * 이름 : 한상민
 * 내용 : 11005. 진법 변환2
 */
public class Test02 {
	public static void main(String[] args) {
		
		// 1. 숫자 n(10)과 b진수 b 입력
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int b = in.nextInt();
		
		int mok = n; 									 // 몫은 n/b .. 마지막에 남은것만 저장
		ArrayList<Character> naMo = new ArrayList<>();	 // 나머지는 n%b .. 계속 저장해둬야함
		
		// 2. 몫은 덮어씌우고, 나머지는 바로 if문 넣어서 변경 후 char화
		while(true) {
			if(mok < b) { 		// 몫이 b보다 작으면 멈춤 (b는 b진수의 b) 
				break;
				
			}else if(10 > mok%b) { // 나머지가 1~9인 숫자
					mok = mok / b; 
					naMo.add(Character.valueOf((char) (mok%b + 48)));
			
			}else if(10 <= mok%b ) { // 나머지가 10~35인 숫자 (A to Z) 
					mok = mok / b;
					naMo.add(Character.valueOf((char) (mok%b + 64)));
			}
		}
		
		// 3. 마지막 몫과 나머지 불러오기
		System.out.print(mok);
		for(int i=naMo.size()-1 ; i>=0 ; i--) {
			System.out.print(naMo.get(i));
		}
		
		in.close();
	}
}
