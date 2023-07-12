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
		/**
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(0);
		
		// m과 n 대소 비교 후 작은 수를 m, 큰수를 n에 담기
		if(m > n) {
			int temp = m;
			m = n;
			n = temp;
		}
		
		// m부터 n까지의 소수를 리스트에 담기
		for(int i=m ; i<=n ; i++) {
			int cnt = 0;
			for(int j=1 ; j<i ; j++) {
				if(i%j == 0) {
					cnt++;
				}
			}
			if(cnt == 1) {
				arr.add(i);
			}
		}
		
		// 최소값과 총 합 출력
		n = 0;
		if (arr.size() > 0) {
			for(int i=1 ; i<arr.size() ; i++) {
				n += arr.get(i);
			}
			System.out.println(n);
			System.out.print(arr.get(0));
		} else {
			System.out.print(-1);
		}

		in.close();
		*/
	}
}
