package step4;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/22
 * 이름 : 한상민
 * 내용 : 3052. 나머지
 */
public class Test08 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int temp[] = new int[10];
		
		//1. 입력 값을 인덱스0부터 차례대로 넣기
		for ( int i=0 ; i<10 ; i++ ) {
			int n = in.nextInt();
			temp[i] = n;
		}
		
		//2. 인덱스별 나머지 값을 인덱스에 넣기
		for ( int i=0 ; i<10 ; i++ ) {
			int temp1 = temp[i]%42;
			temp[i] = temp1;
		}
		
		//3. 같은 값이 몇개 있는지 찾기
		
		
		
		//4. 같은 값 개수만큼 전체에서 빼주기
		
		
		
		in.close();
	}
}
