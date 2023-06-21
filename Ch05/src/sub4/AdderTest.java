package sub4;

/*
 * 날짜 : 2023/06/20
 * 이름 : 한상민
 * 내용 : 싱글톤 객체와 인스턴스 객체 실습
 */


//싱글톤 객체
class Adder {
	private static Adder intance = new Adder();
	public static Adder getIntance() {
		return intance;
	}
	private Adder() {} //new를 하지 못하도록 private
	//~~여기까지가 싱글톤 객체 세트
	
	private Adder(int value) {
		y += value;
	} 
	
	private int x;
	private int y;
	
	public void add(int x, int y) {
		this.x += x;
		y++; // 지역변수 y의 값만 증가하고 출력은 그대로. 색깔이 유의
	}
	
	public void add(int[] arr) {
		x += arr[0];
		y += arr[1];
	}
	
	public static void add(Adder a2) {
		a2.x += 10;
	}
	
	public static Adder add(Adder a3, int value) {
		return new Adder(value);
	}
	
	public void show() {
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}
}


public class AdderTest {
	public static void main(String[] args) {
		
		Adder a1 = Adder.getIntance(); //Adder a1 = new Adder(); 안 됨
		
		a1.add(1, 2);
		a1.show();
		
		int[] arr = {10, 20};
		a1.add(arr);
		a1.show();
		
		Adder.add(a1);
		a1.show();
		
		a1 = Adder.add(a1, 3); //에서 참조값이 바뀐다. 이를 유의하여 디버깅해볼 것
		a1.show();
	}
}
