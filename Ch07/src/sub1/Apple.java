package sub1;

public class Apple { //extends Object를 명시하지 않아도 상속 받고 있음.(암시적)
	
	private String country;
	private int price;
	
	//생성자
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	@Override //tostring crtl space. 오버라이드가 되는 것은 Object 클래스를 상속 받고 있기 때문이다.
	public String toString() {
		
		System.out.println("객체 해시값 : " + hashCode());
		System.out.println("원산지 : " + this.country);
		System.out.println("가　격 : " + this.price);
		
		return super.toString();
	}
}
