package confirm.ch06;

class Printer { // public void로 선언하였지만, 17번을 위해 static을 추가함.
	public static void println(int value) {
		System.out.println(value);
	}
	
	public static void println(boolean value) {
		System.out.println(value);
	}	
	
	public static void println(double value) {
		System.out.println(value);
	}
	
	public static void println(String value) {
		System.out.println(value);
	}
}


public class Test16 {
	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
	}
}
