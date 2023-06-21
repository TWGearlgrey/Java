package sub3;

public class Calc { //class를 사용하려면 new를 해야 함.
	
	// 싱글톤 객체 ~> class내에서 바로 객체를 생성
	private static Calc instance = new Calc(); // ~> static이므로 정적 변수 - 객체 생성
	public static Calc getInstance() {
		return instance;
	} // ~> private이므로 Getter 생성 - 객체 정의

	// 싱글톤 객체 - 생성자
	private Calc() {
		// 초기화 코드
	}
	
	
	
	
	
	
	public int plus(int x, int y) {
		return x + y;
	}
	
	public int minus(int x, int y) {
		return x - y;
	}
	
	public int multi(int x, int y) {
		return x * y;
	}
	
	public int div(int x, int y) {
		return x / y;
	}
}
