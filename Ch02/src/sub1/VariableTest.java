package sub1;

/*
 * 날짜 : 2023/06/12
 * 이름 : 한상민
 * 내용 : Ch02.Java 변수와 연산자 실습
 * 
 * #변수(variable)
 *  - 데이터 처리를 위한 데이터 그릇
 *  - 변수는 메모리 공간이며 각 데이터의 종류에 따라 크기가 다름
 * 
 * #상수(Constant)
 *  - 최초 저장된 데이터로 고정되는 변수
 *  - 대문자로 표기
 */
public class VariableTest {

	public static void main(String[] args) {
		
		// 1. 변수
		int a = 3;
		int b = 7;
		a = 5;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		String name = "홍길동"; // 문자열 String 사용
		System.out.println(name + "님 반갑습니다.");
		
		// 2. 상수
		final int NUM = 5; // int 선언 시엔 변수지만 final 선언 시 상수가 된다. 
			// 상수는 대문자 표기 지향
			// NUM = 7; 선언시 오류 발생
		System.out.println("NUM : " + NUM); 
	}

}
