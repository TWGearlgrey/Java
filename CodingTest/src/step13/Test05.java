package step13;

import java.util.Scanner;

/*
 * 날짜 : 2023/00/00
 * 이름 : 한상민
 * 내용 : 0000. 제목
 * 
 * 참조 : 수의 범위가 작다면 카운팅 정렬을 사용하여 더욱 빠르게 정렬할 수 있습니다.
 * 
 * 참고
 *  - https://st-lab.tistory.com/104?category=856997
 */
public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String result = "";
		
		// 배열, 리스트 생성
		int[] idx = new int[n];
		int[] cnt = new int[10001];
		int[] rst = new int[n];
		
		// 1. 입력값 idx, cnt 담기
		for(int i=0 ; i<n ; i++) {
			idx[i] = sc.nextInt();
			cnt[idx[i]]++;
		}
		
		// 2. cnt[i+1] += cnt[i]; 처리 해주기.
		for(int i=1 ; i<10001 ; i++) {
			cnt[i] += cnt[i-1];
		}
		
		// 3. cnt를 rst 처리하여 출력
		for(int i=n-1 ; i>=0 ; i--) {
			cnt[idx[i]]--;
			rst[cnt[idx[i]]] = idx[i];
		}
		
		for(int i=0 ; i<n ; i++) {
			result += ""+rst[i]+"\n";
		}
		
		System.out.println(result);
	}
}
