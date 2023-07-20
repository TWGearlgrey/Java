package confirm.ch07;

class Test07_Parent extends Test09 {
	
	public String nation;
	
	public Test07_Parent() {
		this("대한민국");
		System.out.println("Test07_Parent() call");
	}

	public Test07_Parent(String nation) {
		this.nation = nation;
		System.out.println("Test07_Parent(String nation) call");
	}
}

class Test07_Child extends Test07_Parent {
	public String name;
	
	public Test07_Child() {
		this("홍길동");
		System.out.println("Test07_child() call");
	}
	
	public Test07_Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}

public class Test07_ChildExample {
	public static void main(String[] args) {
		Test07_Child child = new Test07_Child();
	}
}
