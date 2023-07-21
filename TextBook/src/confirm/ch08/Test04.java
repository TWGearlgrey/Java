package confirm.ch08;

interface Aa {
	public void method1();
}

class Bb implements Aa {
	@Override
	public void method1() {
		System.out.println("B - method1()");
	}
}

class Cc implements Aa {
	@Override
	public void method1() {
		System.out.println("C - method1()");
	}
}

class Dd extends Bb {
	@Override
	public void method1() {
		super.method1();
	}
}

class Ee extends Cc {
	@Override
	public void method1() {
		super.method1();
	}
}
	
public class Test04 {
	public static void action(Aa a) {
		a.method1();
	}
	
	public static void main(String[] args) {
		action(new Bb());
		action(new Cc());
		action(new Dd());
		action(new Ee());
	}
}
