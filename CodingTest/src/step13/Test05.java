package step13;

import java.util.ArrayList;
import java.util.List;
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
		
		// 배열, 리스트 생성
		int[] idx = new int[n];
		List<Integer> cnt = new ArrayList<>(); // List로 바꿔서 메모리 줄이기.
		int[] rst = new int[n];
		
		// 입력값 idx, cnt 담기
		for(int i=0 ; i<n ; i++) {
			idx[i] = sc.nextInt(); 
			cnt.set(idx[i], cnt.get(idx[i])+1); 
		}
		
		// cnt[i+1] += cnt[i]; 처리 해주기.
		
		
		
		
		
		
		
		
	}
}
