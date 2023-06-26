package sub1;

/*
 * 날짜 : 2023/06/26
 * 이름 : 한상민
 * 내용 : Java 예외처리 실습하기
 * 
 * 예외처리(Exception)
 *  - 예외는 프로그램 실행 중에 발생하는 모든 에러(Error)
 *  - 실행 중(Runtime) 발생하는 예외와 컴파일(CompileTime)에 발생하는 예외처리
 *  - 메서드 내부에 발생하는 예외를 호출한 쪽으로 throws
 *  - 사용자가 생성한 예외를 throw
 *  
 */
public class ExceptionTest {
	public static void main(String[] args) {
		
		//////////////////////////////////////
		// 실행 예외
		//////////////////////////////////////
		
		// 예외상황1 : 어떤 수를 0으로 나눌 때
		int num1 = 1;
		int num2 = 0;
		
		int rs1 = 0;
		int rs2 = 0;
		int rs3 = 0; // 코드의 통일성을 위해 rs1~rs3도 try catch처리 (통일성/가독성 측면)
		int rs4 = 0; // try 블록 안 rs4는 지역변수이기때문에 상위 블록에 선언을 해준다.
		
		try {
			// 예외가 발생할 가능성이 있는 코드작성
			rs1 = num1 + num2;
			rs2 = num1 - num2;
			rs3 = num1 * num2;
			rs4 = num1 / num2;
			
		} catch (ArithmeticException e) {
			// 어떤 수를 0으로 나눌 때
			e.printStackTrace(); // 예외 내용 출력
			
		}
		
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		System.out.println("rs3 : " + rs3);
		System.out.println("rs4 : " + rs4);
		
		// 예외상황2 : 배열의 인덱서 범위를 벗어났을 때
		int[] arr = {1, 2, 3, 4, 5};
		
		try {
			for( int i=0 ; i<6 ; i++ ) {
				System.out.println("arr[" + i + "] : " + arr[i]);
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			// 배열의 인덱스 범위를 벗어났을 때
			e.printStackTrace();
		}
		
		// 예외상황3
		Animal ani = null;  // Animal ani; 와 같은 표현, ani는 참조변수이다.(=즉 참조값이 있어야함)
							// 객체 Animal이 생성되지 않은 상태.
		try {
			ani.move();
			ani.hunt();			
		} catch (NullPointerException e) {
			// 객체 생성없이 참조(Null 포인터 에러)
			e.printStackTrace();
		}
		
		// 예외상황4
		Animal a1 = new Tiger(); // 업캐스팅
		Animal a2 = new Eagle(); // 업캐스팅
		Animal a3 = new Shark(); // 업캐스팅
		
		try {
			Eagle eagle = (Eagle) a1; // 다운캐스팅
			Shark shark = (Shark) a2; // 다운캐스팅
			Tiger tiger = (Tiger) a3; // 다운캐스팅
		} catch (ClassCastException e) {
			// 잘못된 캐스팅
			e.printStackTrace();
		}	
		
		
		//////////////////////////////////////
		// 일반 예외
		//////////////////////////////////////
		
		try {
			Class animal = Class.forName("sub1.Lion"); // 정적 메서드, 클래스라고 하는 클래스 타입
		} catch (ClassNotFoundException e) {
			// 찾을 수 없는 클래스 선언
			e.printStackTrace();
		} finally {
			// 예외처리 발생 유무에 상관없이 마지막에 항상 실행되는 코드
			System.gc(); //( garbage collector ) 메모리 정리. Heap의 instance를 정리
			
			System.out.println("finally 실행...");
		}
		
		
		
		
		System.out.println("프로그램 정상 종료...");
	}
}
