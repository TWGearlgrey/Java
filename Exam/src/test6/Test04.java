package test6;

/*
 * 날짜 : 2023/07/18
 * 이름 : 한상민
 * 내용 : 자바 총 정리 연습문제
 */
public class Test04 {
	public static void main(String[] args) {
		
		System.out.printf("%7s %10s %5s %6s\n", "10진수", "2진수", "8진수", "16진수");
		
		for (int num=1 ; num<=128 ; num++) {
			System.out.printf("%7s %10s %5s %6s\n", num,
													Integer.toString(num,  2),
													Integer.toString(num,  8),
													Integer.toString(num, 16));
		}
	}
}
