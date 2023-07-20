package confirm.ch07;

class Test08_Tire extends Test09 {
	public void run() {
		System.out.println("일반 타이어가 굴러갑니다.");
	}
}

class Test08_SnowTire extends Test08_Tire {
	@Override
	public void run() {
		System.out.println("스노우 타이어가 굴러갑니다.");
	}
}

public class Test08_SnowTireExample {
	public static void main(String[] args) {
		Test08_SnowTire snowTire = new Test08_SnowTire();
		Test08_Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
	}
}
