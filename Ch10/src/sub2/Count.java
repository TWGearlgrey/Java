package sub2;

public class Count {
	
	private int num;
	
	public int getNum() {
		return num;
	}
	
	// 동기화 블럭 : 스레드 간 경합을 막고, 동기방식으로 실행하기 위한 블럭
	public synchronized void setNum() {
		this.num++;
	} /* 여러 메소드가 동시에 실행 될 수 있는 메서드였지만 
	   * sync(동기화)하여 하나의 메서드만 처리할 수 있게 해줌 */
	
}
