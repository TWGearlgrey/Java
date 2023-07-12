package step09;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 날짜 : 2023/07/11
 * 이름 : 한상민
 * 내용 : 2581. 소수
 */
public class Test05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		if(m > n) {
			int temp = m;
			m = n;
			n = temp;
		}
		
		for(int i=m ; i<n ; i++) {
			int cnt = 0;
			for(int j=1 ; j<i ; j++) {
				if(m%j == 0) {
					
				}
			}
		}
	}
}
