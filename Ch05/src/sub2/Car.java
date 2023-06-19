package sub2;

public class Car {
	// 속성
	private String name;	// private대신 protected를 사용하면 상속의 개념
	private String color;	// name, color, speed는 private했으므로 외부에서 참조할 수 없다.
	private int speed;
	
	// 생성자 : 캡슐화된 속성을 초기화하기 위한 메서드
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	
	
	// 메서드(기능) ~> 메서드에 private를 걸면 내부에서만 사용 할 수 있기 때문에, 메서드는 캡슐화의 대상이 아니다.
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : "+this.name);
		System.out.println("차량색 : "+this.color);
		System.out.println("현재속도 : "+this.speed);
		
	}
	
	// Getter, Setter 정의 - 필요에 따라서 정의.
	public String getName() {
		return name;
	} //get만 적고 ctrl + space
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
