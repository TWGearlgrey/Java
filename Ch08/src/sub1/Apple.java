package sub1;

public class Apple {
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}

	@Override
	public String toString() { // toString은 Object에 정의되어있는 메서드
		String result = "원산지 : " + country + "\n가격 : " + price;
		return result;
	}
}
