package step13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

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
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int [n];
		int[] cnt = new int [10001];
		int[] rst = new int [n];
		
		// 1번 과정
		for(int i=0; i<n ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			cnt[arr[i]]++;
		}
		
		// 2번 과정
		for(int i=1 ; i<n ; i++) {
			cnt[i] += cnt[i-1];
		}
		
		// 3번 과정
		for(int i=arr.length-1 ; i>=0 ; i--) {
			int v = arr[i];
			cnt[v]--;
			rst[cnt[v]] = v;
		}
		
		
		

	}
}
