package sub5;

/*
• Whale 클래스는 Animal 클래스를 상속받고, 수영 여부를 기록하는 멤버 변수와
setter/getter 메소드가 필요하다.

• Animal 클래스에는 age, name, sex라는 private 멤버 변수와 이에 대한 setter/get-
ter 메소드를 정의해야 한다.

• Whale 클래스는 Animal 클래스를 상속받아 swim이라는 boolean 타입의 멤버
변수와 이에 대한 setter/getter 메소드를 구현해야 한다.

• AnimalTest 클래스에서는 Whale 객체를 생성하고 setName(), setAge(),
setSwim() 메소드를 사용하여 객체의 이름, 나이, 수영 여부를 설정한 후, getName(),
getAge(), getSwim() 메소드를 사용하여 Whale 객체의 정보를 출력한다.

• Whale 클래스와 AnimalTest 클래스는 각각 별도의 파일로 작성하여 컴파일하고
실행해야 한다.
 */

public class AnimalTest {
	public static void main(String[] args) {
		Whale w = new Whale();
		w.setName("고래");
		w.setAge(5);
		w.setSwim(true);
		System.out.println("이름:" + w.getName());
		System.out.println("나이:" + w.getAge());
	System.out.println("수영여부:" + w.getAge());
		
	}
}
