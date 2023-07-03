package sub3;

public class AddThread extends Add implements Runnable { 
				// Add와 Thread 다중상속이 안 돼서 인터페이스 사용
	private int start;
	private int end;
	
	public AddThread(int start, int end) {
		this.start = start;
		this.end   = end;
	}
	
	@Override
	public void run() {
		for (int k=start ; k<=end ; k++) {
			setNum(k);
		}
	}
}
