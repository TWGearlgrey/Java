package sub4;

/*
 * 날짜 : 2023/06/15
 * 이름 : 한상민
 * 내용 : Java 메서드 오버로딩 실습하기
 */
public class MethodOverloadTest {
	public static void main(String[] args) {
		
		int		r1 = plus(1); // 매개변수가 하나이기 때문에 첫 번째 메서드를 호출
		int		r2 = plus(1, 2); // 정수형 매개변수 2개이기때문에 두 번째 메서드
		double 	r3 = plus(1.1, 2.3); // 소수 매개변수 2개이므로 세 번째 메서드
		String 	r4 = plus("Hello", "World");
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4);
		
	} // 클래스이름은 대문자로 시작. 메서드 이름은 소문자로 시작.

	
	// 오버로딩 메서드 정의
	public static int plus(int a) {
		return a + a;
	}
	
	public static int plus(int a, int b) {
		return a + b;
	}
	
	public static double plus(double a, double b) {
		return a + b;
	}
	
	public static String plus(String a, String b) {
		return a + b;
	}
		

	
}
