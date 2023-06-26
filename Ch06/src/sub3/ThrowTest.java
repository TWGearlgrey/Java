package sub3;

/*
 * 날짜 : 2023/06/26
 * 이름 : 한상민
 * 내용 : Java 예외발생 시키기 실습하기
 */

// 사용자 정의 예외 클래스
class MinusException extends Exception {
	
	public MinusException(String msg) {
		super(msg);
	}
}

class OverException extends Exception {
	public OverException(String msg) {
		super(msg);
	}
}

class Score {
	public void check(int score) throws MinusException, OverException { 
								//이를 Exception으로 통일 할 수 있다. 상속을 받고 있기 때문에.
		
		if(score < 0) {
			// 예외 발생 시키기1
			throw new MinusException("점수는 음수가 될 수 없습니다.");
		}else if( score > 100 ) {
			// 예외 발생 시키기2
			throw new OverException("100점을 초과할 수 없습니다.");
		}else {
			System.out.println("점수가 정상입니다.");
		}
	}
}

public class ThrowTest {
	public static void main(String[] args) {
		
		Score score = new Score();

		try {
			score.check(-3);
			score.check(102); // 코드 흐름상 진행이 안 됨. 진행을 하려면 다 따로 try ~ catch를 해줘야 함.
			score.check(96);
		} catch (MinusException e) {
			e.printStackTrace();
		} catch (OverException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료...");
	}
}


















