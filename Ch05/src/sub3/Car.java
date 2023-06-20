package sub3;

public class Car {
	//속성 ~> Heap에 저장 됨
	private String name;
	private String color;
	private int speed;
	
	//클래스 변수(정적 변수) ~> Method Area라는 영역에 저장 됨
	public static int count; //스태틱으로 직접 참고하기 때문에 static 선언이 일반적이다.
	
	//생성자 : 캡슐화 된 속성을 초기화하기 위한 메서드
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++; // ~> ' this. '를 생략해도 됨
	}
	
	//클래스 메서드(정적 메서드)
	public static int getCount() {
		return count;
	} // ~> 리턴이 있으므로 void(X), 클래스 변수에 맞춰 static을 붙여줌
	
	//기능
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	
	public void show() {
		System.out.println("차량명 : "+ this.name);
		System.out.println("차량색 : "+ this.color);
		System.out.println("현재속도 : "+ this.speed);
	}
	
}
