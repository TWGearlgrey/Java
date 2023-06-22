package step4;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/22
 * 이름 : 한상민
 * 내용 : 10818번. 최소, 최대
 */
public class Test03 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int arr[] = new int[N];
		
		for( int i=0 ; i<N ; i++ ) {
			int A = in.nextInt();
			arr[i] = A;
		}

		int min = 0;
		for( int i=0 ; i<N ; i++ ) {
			min = arr[i];
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.print(min+" ");
		
		
		int max = 0;
		for( int i=0 ; i<N ; i++ ) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.print(max);
	}
}
