package sub1;
/*
 * 날씨 : 2023/06/19
 * 이름 : 한상민
 * 내용 : Java 클래스 실습하기
 * 
 * 클래스와 객체
 *  - 클래스는 객체를 생성하는 구조체이고 속성(필드, 멤버변수)과 기능(멤버 메서드)으로 설계
 *  - 객체(Object)는 클래스의 실제 인스턴스(Instance, 클래스의 실체, 메모리상의 Heap), new 연산으로 생성
 *  - 
 */
public class ClassTest {
	public static void main(String[] args) {
		
		// 객체(Object) 생성
		Car sonata = new Car(); // new 뒤의 Car는 같은 package에 있는 Class 명, =가 나오면 좌측은 변수
		
		// 객체 초기화
		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0; // Car.java에서 선언만 된 것을 초기화 해줌
		
		// 객체 활용
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
		
		
		// 객체 선언, 생성, 초기화
		Car avante;						//선언
		avante = new Car();				//생성
		avante.name  = "아반떼";			//초기화
		avante.color = "검은색";
		avante.speed = 0;
		
		avante.speedUp(80);				//객체 재활용
		avante.speedDown(40);
		avante.show();
		
		
		// Account 객체생성과 초기화, 활용
		Account kb = new Account();		//객체 생성
		kb.bank = "국민은행";				//객체 초기화
		kb.id = "101-21-0101";
		kb.name = "김유신";
		kb.balance = 10000;
		
		kb.deposit(40000);				//객체 활용
		kb.withdraw(30000);
		kb.show();
		
		
		// Account 객체생성과 초기화, 활용
		Account wr = new Account();		//객체 생성
		wr.bank = "우리은행";				//객체 초기화
		wr.id = "123-45-6789";
		wr.name = "김춘추";
		wr.balance = 1000;
		
		wr.deposit(39000);				//객체 활용
		wr.withdraw(7000);
		wr.show();
		
		//위 모든 식 중 선언은 총 4번
	}
}
