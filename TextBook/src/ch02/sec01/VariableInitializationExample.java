package ch02.sec01;

/*
 * 날짜 : 2023/06/12
 * 이름 : 한상민
 * 내용 : 교재 p37 예제
 */
public class VariableInitializationExample {
	public static void main(String[] args) {
		int value = 5; // int value; 만 하였을 땐 선언만 된 상태.
		int result = value + 10; /*value를 선언만 하고 초기화를 하지 않았기 때문에 오류가 발생
									'int value = 변수'로 초기화를 해주어야 한다.*/
		System.out.println(result);
	}
}
