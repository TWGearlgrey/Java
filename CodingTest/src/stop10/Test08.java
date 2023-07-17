package stop10;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/17
 * 이름 : 한상민
 * 내용 : 14215. 세 막대
 */
public class Test08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int[] arr = {a, b, c};
		
		for(int i=1 ; i<3 ; i++) {
			if(a < arr[i]) {
				int temp = a; 
				a = arr[i];
				arr[i] = temp;
			}
		}
		
		if(b == c) {
			a = b;
		}else if(b != c) {
			a = b+c-1;
		}
		
		System.out.print(a+b+c);
		
		/*
		 * 1. 최대길이 및 사이드길이 2개 알아내기
		 *  2-1. 사이드 길이가 같다면 최대길이도 '사이드와 같게' 맞추기
		 *  2-2. 사이드 길이가 다르다면 '사이드길이의 합-1' 로 만들기
		 * 3. 세 변의 합 출력
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
