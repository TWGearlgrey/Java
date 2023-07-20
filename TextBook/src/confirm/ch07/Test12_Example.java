package confirm.ch07;

class Test12_A {
	public void method1() {
		System.out.println("A-method1()");
	}
}

class Test12_B extends Test12_A{
	public void method1() {
		System.out.println("B-method1()");
	}
}

class Test12_C extends Test12_A {
	public void method1() {
		System.out.println("C-method1()");
	}
	public void method2() {
		System.out.println("C-method2()");
	}
}

public class Test12_Example {
	public static void action(Test12_A a) {
		a.method1();
		if(a instanceof Test12_C c) {
			c.method2();
		}
	}
	
	public static void main(String[] args) {
		action(new Test12_A());
		action(new Test12_B());
		action(new Test12_C());
	}
}
