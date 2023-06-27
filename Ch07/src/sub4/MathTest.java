package sub4;

/*
 * 날짜 : 2023/06/27
 * 이름 : 한상민
 * 내용 : Java Math 클래스 실습하기
 */
public class MathTest {
	public static void main(String[] args) {
		
		// Math math = new Math(); 안 됨. 싱글톤도 안 됨. 프라이빗 생성자이기때문
		
		// 기본 메서드
		System.out.println("절대값 : " + Math.abs(-5));
		System.out.println("제곱근 : " + Math.sqrt(9));
		System.out.println("올림값 : " + Math.ceil(1.2));
		System.out.println("올림값 : " + Math.ceil(1.8)); // ceil과 floor는 자주 씀
		System.out.println("내림값 : " + Math.floor(1.2));
		System.out.println("내림값 : " + Math.floor(1.8));
		System.out.println("반올림 : " + Math.round(1.2));
		System.out.println("반올림 : " + Math.round(1.8));
		
		
		// Random 메서드
		double num1 = Math.random();
		System.out.println("num1 : " + num1); // 0~1 사이의 랜덤한 실수

		double num2 = num1 * 10;
		System.out.println("num2 : " + num2); // 0~10 사이의 실수
		
		double num3 = Math.ceil(num2);
		System.out.println("num3 : " + num3); // 0~10 사이의 정수
		
		// 1~45사이 임의의 정수
		int rand = (int) Math.ceil(Math.random() * 45);
		System.out.println("rand : " + rand);
	}
}
