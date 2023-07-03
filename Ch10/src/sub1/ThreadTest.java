package sub1;

/**
 * 날짜 : 2023/07/03
 * 이름 : 한상민
 * 내용 : Java Thread 실습하기
 * 
 * 스레드(Thread)
 *  - 하나의 프로세스 안에서 실행되는 프로그램 실행 흐름
 *  - 스레드는 동시에 실행되는 병행실행
 *  - Thread 클래스를 상속 받아 start 실행
 */
public class ThreadTest {
	public static void main(String[] args) {
		
		// 스레드 객체 생성
		SubThread st1 = new SubThread("Sub1");
		SubThread st2 = new SubThread("Sub2");
		
		// 자식스레드 실행
		st1.start(); // run 대신 start로 호출하면 병행실행이 된다. (멀티스레드)
		st2.start(); // start에서 run이 호출 됨. main은 st1을 호출하고 
					 // 종료를 기다리지 않고 st2를 호출. 즉 동시에 실행된다.
		
		for(int i=0 ; i<10 ; i++) {
			
			try {
				// 1초 대기
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Main Thread 실행...");
			
		}
		
		System.out.println("Main Thread 종료...");
		
	}
}
