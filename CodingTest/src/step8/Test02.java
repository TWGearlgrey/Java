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
		/*
		 * 88(10)을 2진수로 변환시 
		 * 2 | 88 
		 * 2 | 44 ... 0
		 * 2 | 22 ... 0
		 * 2 | 11 ... 1
		 * 2 |  5 ... 1
		 * 2 |  2 ... 1
		 * 2 |  1 ... 0
		 * 
		 * -> 1011100(2)
		 */
		
		// 숫자 n(10)과 b진수 b 입력
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int b = in.nextInt();
		
		ArrayList<Character> num = new ArrayList<>(); 
		
		int temp = n;
		// 몫은 덮어씌우고, 나머지는 바로 if문 넣어서 변경 후 char화
		while(true) {
			if(temp < b) {
				break;
			}else {
				if(10 < n%b ) {
					
				}
			}
			
		}
		
		
		
		
		
	}
}
