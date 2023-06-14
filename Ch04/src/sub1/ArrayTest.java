package sub1;

/*
 * 날짜 : 2023/06/14
 * 이름 : 한상민
 * 내용 : Java 배열 실습하기
 */
public class ArrayTest {
	public static void main(String[] args) {
		
		// 배열
		int[]    arr1 = {1, 2, 3, 4, 5}; // 변수로는 못담기 때문에 int[] 이용 '[]'이 배열 키워드
		char[]   arr2 = {'A', 'B', 'C'}; // 배열은 같은 타입의 자료만 담을 수 있다.
		String[] arr3 = {"서울", "대전", "대구", "부산", "광주"}; 
		
		// 원소 출력
		System.out.println("arr1[0] : " + arr1[0]); //1번째 원소
		System.out.println("arr1[2] : " + arr1[2]); //3번째 원소
		System.out.println("arr1[3] : " + arr1[3]); //4번째 원소

		System.out.println("arr2[2] : " + arr2[2]); //3번째 원소
		
		System.out.println("arr3[3] : " + arr3[3]); //4번째 원소
		
		
		// 배열 길이
		System.out.println("arr1 길이 : " + arr1.length); 
		System.out.println("arr2 길이 : " + arr2.length);
		System.out.println("arr3 길이 : " + arr3.length); // 원소길이(=원소갯수)이다. arr3의 원소길이는 5
		
		
		// 배열 반복문
		for(int i=0 ; i<arr1.length ; i++) {
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println(); // 개행
		
		for(char c : arr2) {
			System.out.print(c +" ");
		}
		
		System.out.println(); // 개행
		
		for(String city : arr3) {
			System.out.print(city +" ");
		}

		System.out.println(); // 개행
		
		
		// 1차원 배열
		int[] scores = {80, 60, 78, 62, 92}; // 배열의 변수를 선언할 땐 복수형으로 써주는게 좋음
		int total = 0;
		
		for(int score : scores) {
			total += score;
		} // for(원소 : 배열) ~> 배열에서 원소를 하나씩 꺼냄
		
		System.out.println("scores 합 : " + total);
		
		
		// 2차원 배열
		int[][] arr2d = {{1,  2,  3,  4}, 
						 {5,  6,  7,  8}, 
						 {9, 10, 11, 12}}; 
				/* 2차원은 '[][]'로 선언한다. {}는 선형으로 안에 또 다른 배열들이 들어간다. 
					세로는 행, 가로는 열 번호. 행을 우선적으로 읽음 */
		
		System.out.println("2차원 배열 출력");
		for(int a=0 ; a<3 ; a++) {
			for(int b=0 ; b<4 ; b++) {
				System.out.println("arr2d["+a+"]["+b+"] : " + arr2d[a][b]);
			}
		}
		
		
		// 3차원 배열
		int[][][] arr3d = {{{1,  2,  3}, 
							{4,  5,  6}, 
							{7,  8,  9}}, // 0 
						   {{10, 11, 12}, 
							{13, 14, 15}, 
							{16, 17, 18}}, // 1
						   {{19, 20, 21}, 
							{22, 23, 24}, 
							{25, 26, 27}}}; // 2
					/* 큐브의 각 조각마다 원소가 담긴 느낌.
						즉 숫자 1의 인덱스는 0 0 0, 숫자 27의 인덱스는 2 2 2이다. */
		
		System.out.println("3차원 배열 출력");
		for(int a=0 ; a<3 ; a++) {
			for(int b=0 ; b<3 ; b++) {
				for(int c=0 ; c<3 ; c++) {
					System.out.printf("arr3d[%d][%d][%d] : %d\n", a, b, c, arr3d[a][b][c]);	
				}
			}
		}
		
	}
}
