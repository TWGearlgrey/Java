package sub9;

public class Sedan implements Car { //상속이 아닌 구현을 해야하므로 impements를 사용
	
	private String name;	
	private String color;	
	private int speed;	
		
	//생성자 단축키 알트+쉬프트+S 
	public Sedan(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}

	
	@Override
	public void speedUp(int speed) {
		this.speed += speed;
	}

	@Override
	public void speedDown(int speed) {
		this.speed -= speed;
	}

	@Override
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
	}
}
