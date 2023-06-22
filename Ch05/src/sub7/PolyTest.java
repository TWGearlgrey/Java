package sub7;
/**
 * 날짜 : 2023/06/22
 * 이름 : 한상민
 * 내용 : Java 다형성 실습하기
 * 
 * 다형성(Polymorphism)
 *  - 상속관계에서 부모클래스의 기능이 자식클래스에서 다양한 기능으로 변하는 특성 (사전적 정의)
 *  - 객체의 타입선언을 부모클래스 타입으로 선언 (문법적 정의)
 *  - 다형성을 활용해서 프로그래밍의 중복을 줄이고 유연성을 높임
 */
public class PolyTest {
	public static void main(String[] args) {

		// 다형성을 적용한 객체 생성(업캐스팅)
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark(); // Shark a3 = new Shark();에서 다형성을 적용함
		
		a1.move();
		a1.hunt();
		
		a2.move();
		a2.hunt();
		
		a3.move();
		a3.hunt();
	
		
		// 다운 캐스팅
		Tiger tiger = (Tiger) a1;
		Eagle eagle = (Eagle) a2;
		Shark shark = (Shark) a3;
		
		tiger.move();
		tiger.hunt();
		
		eagle.move();
		eagle.hunt();
		
		shark.move();
		shark.hunt();
	
		
		// 객체 타입 비교연산
		if(a1 instanceof Tiger) {
			System.out.println("a1은 Tiger 입니다.");
		}else if(a1 instanceof Eagle) {
			System.out.println("a1은 Eagle 입니다.");
		}else if(a1 instanceof Shark) {
			System.out.println("a1은 Shark 입니다.");
		}

		
		// 다형성을 활용한 객체배열
		Animal arr[] = {tiger, eagle, shark}; //자료형을 부모클래스로하여 배열에 담을 수 있다.
		arr[0].move();
		arr[1].move();
		arr[2].move();
		
		
		
	}
}
