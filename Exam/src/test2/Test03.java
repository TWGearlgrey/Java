package test2;

/*
 * 날짜 : 2023/06/15
 * 이름 : 한상민
 * 내용 : 자바 배열 역순으로 정렬 연습문제
 */
public class Test03 {
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// 현재 배열 출력
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i]+", ");
		}
		
		System.out.print("\n");
		
		// 배열의 원소를 역순으로 정렬
		for (int j = 0; j < 5; j++) {
			int temp = arr[j];
			arr[j] = arr[9 - j]; // 인덱스0과 9를 비교. 인덱스 0이 9로 갈때, 9에 있던 숫자를 0으로 보냄
			arr[9 - j] = temp;
		}
		
		// 역순으로 정렬된 배열 출력
		for (int n : arr) { //for(원소:배열) ~~> 배열에서 원소를 하나씩 꺼냄
			System.out.print(n+", ");
		}
	}
}
