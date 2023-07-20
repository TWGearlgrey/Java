package confirm.ch07;

class Test11_Activity {
	public void onCreate() {
		System.out.println("기본적인 실행 내용");
	}
}

class Test11_MainActivity extends Test11_Activity {
	@Override
	public void onCreate() {
		super.onCreate();
		System.out.println("추가적인 실행 내용");
	}
}

public class Test11_ActivityExample {
	public static void main(String[] args) {
		
		Test11_MainActivity act = new Test11_MainActivity();
		
		act.onCreate();
	}
}
