package step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

/* 
 * 시간초과로 실패한 코드
 * int N = Integer.parseInt(br.readLine());
 * int[] arrs = new int[N];
 * 
 * for(int i=0 ; i<N ; i++) {
 * 	arrs[i] = Integer.parseInt(br.readLine());
 * }
 * 
 * br.close();
 * bw.flush();
 * bw.close();
 * 
 * Arrays.sort(arrs);
 * 
 * String result = "";
 * 
 * for(int i=0 ; i<N ; i++) {
 * 	result += "" + arrs[i] + "\n";
 * }
 * 
 * System.out.println(result);
 */

public class Test05 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] cnt = new int [10001];
		
		// 1번 과정
		for(int i=0; i<n ; i++) {
			cnt[Integer.parseInt(br.readLine())]++;
		}
		
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		// 카운팅 --; 하며 출력 buffer
		for(int i=0 ; i<10001 ; i++) {
			while(cnt[i] > 0) {
				sb.append(i).append("\n");
				cnt[i]--;
			}
		}
		
        // 출력
		System.out.println(sb);
	}
}