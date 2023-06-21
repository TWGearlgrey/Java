package ch02.sec01;

/*
 * 날짜 : 2023/06/21
 * 이름 : 한상민
 * 내용 : 교재 p38 예제
 * 
 * 임시변수(예제에서는 temp)를 이용해 두 변수의 값 교환
 */
public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
	} // 물병, 우유병, 빈병을 섞지 않고 옮긴다 생각하면 이해가 쉽다.
}