package sub8;

public abstract class Car { //추상메서드를 갖기때문에 추상클래스
	protected String name;
	protected String color;
	protected int speed;
	
	//생성자
	public Car(String name, String color, int speed) {
		this.name  = name;
		this.color = color;
		this.speed = speed;
	}
	
	
	public abstract void speedUp(int speed);
	
	public abstract void speedDown(int speed); //미완성된 추상메서드. 상속을 목적을 위해 만들었기 때문.
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
	}	
}
