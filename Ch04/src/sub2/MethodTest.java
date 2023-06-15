package sub2;

/*
 * 날짜 : 2023/06/15
 * 이름 : 한상민
 * 내용 : Java 메서드 실습하기
 */
public class MethodTest {
	
	//전역변수 : 메서드 밖인 클래스 영역에서 선언된 변수.(지역변수와 색이 다른걸 확인 할 수 있음)
	int num = 1;
	
	// main method : 프로그램 진입점
	public static void main(String[] args) {
		
		//메서드 호출
		int y1 = f(1); // f(1)에서 메서드를 호출한 뒤 출력값이 y1으로 간다.
		int y2 = f(2); // 메서드를 재활용한다.
		int y3 = f(3); // 디버깅을 할 때, 메서드로 진입하려면 F5
		
		System.out.println("y1 : " + y1);
		System.out.println("y2 : " + y2);
		System.out.println("y3 : " + y3);
		
		
		//메서드 지역변수와 스택
		int t1 = sum(1, 10); // 출력값을 받을 그릇인 변수를 선언해야 함.
		int t2 = sum(1,100); 
		
		System.out.println("t1  : " + t1);
		System.out.println("t2  : " + t2);
		
	} // public static void main ~~>도 public class라는 구조체 안에 있는 메서드이다.
	
	
	
	// 메서드 정의 
	public static int f(int x) {
		
		int y = 2 * x + 3;
		return y; // public static void라고 선언하면 출력하는 출구가 없는 함수가 됨.(~> 아래 int y 선언시 오류 발생)
	} // static은 원래 빠지는거지만, main에서 호출해야하기 때문에 main의 static에 맞춰 준다. 또한 int y로 선언했기 때문에 f()도 int로 맞춰준다.

	
	// 메서드 정의
	public static int sum(int start, int end) {
		int total = 0; // <~~ 지역변수 : 메서드가 종료되면 스택에서 해제, 매개변수도 지역변수이다.

		for(int  k=start ; k<=end ; k++) {
			total += k;
		} // 해당 블록이 끝나면 선언된 지역변수는 사라진다.
		return total; //리턴 값이 있다면 void를 넣어선 안 됨. 출력값은 int이므로 int를 넣어줌. 
	} // public void를 기본으로 하고 필요에 맞게 수정하여 사용
	
	
	
	
	
	
}
