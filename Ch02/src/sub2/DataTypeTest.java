package sub2;
/*
 * 날짜 : 2023/06/12
 * 이름 : 한상민
 * 내용 : Ch02.Java 자료형 실습
 * 
 * 자료형(Data Type)
 *  - 변수에 저장되는 데이터의 종류와 크기를 나타낸 키워드
 *  - 자료형은 기본형과 참조형(객체)으로 나뉨
 *  
 * int, double, boolean, String 이 가장 자주 사용된다.
 */
public class DataTypeTest {
	public static void main(String[] args) {
		
		// 1. 정수형
		byte num1 = 127;
		short num2 = 32767;
		int num3 = 2147483647; // 가장 많이 쓰는 메소드
		long num4 = 922337203685477507L; // 'L' 해당 데이터가 long 데이터라는 것을 표시하기 위함
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		
		
		// 2. 실수형
		float var1 = 0.123456789f; // 소수 8번째 자리까지 출력됨
		double var2 = 0.123456789123456789; // 실수는 더 정밀하게 나타내기 위해 사용하므로 double을 더 많이 사용한다. 출력은 17자리까지
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		
		
		// 3. 논리형
		boolean data1 = true;
		boolean data2 = false;
		
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		
		
		// 4. 문자형
		char c1 = 'A'; // char는 int값이다. 알파벳은 아스키코드 -> 숫자로 나타낼 수 있다.
		char c2 = '가';
		
		System.out.println("c1 : " + c1); // '가을'과 같은 두글자는 출력이 불가능.
		System.out.println("c2 : " + c2); // 한 글자만 출력 가능하기 때문에, 활용도가 떨어짐.
		
		
		// 5. 문자열
		String str1 = "A";
		String str2 = "가";
		String str3 = "Apple"; // 한 글자 이상 출력 가능.
		String str4 = "가을";
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		System.out.println("str4 : " + str4);
	}

}
