package sub1;

public class Account {
	// 속성
	String bank; 	//은행명
	String id;		//계좌번호
	String name;	//예금주
	int balance;	//잔액
	
	// 기능
	public void deposit(int money) {
		this.balance += money;			//money는 지역변수, balance는 전역변수다.
	}
	
	public void withdraw(int money) {
		this.balance -= money;
	}

	
	public void show() {
		System.out.println("--------------------");
		System.out.println("은행명 : " + this.bank);
		System.out.println("계좌번호 : " + this.id);
		System.out.println("입금주 : " + this.name);
		System.out.println("현재잔액 : " + this.balance);
		System.out.println("--------------------");
	}



}
