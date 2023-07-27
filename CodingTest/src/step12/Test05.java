package step12;

import java.util.Scanner;

/*
 * 날짜 : 2023/00/00
 * 이름 : 한상민
 * 내용 : 0000. 제목
 */
public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String series = "666";
		String result = null; 
		int fNum = 0; 
		int lNum = 0;
		
		boolean switcH = true;
		
		for(int i=0 ; i<n ; i++) {
			
			// 앞자리가 1씩 증가하는 패턴
			// 앞자리는 cnt고정, 뒷자리는 0부터 9까지 증가하는 패턴
			// 앞자리가 66이 됐을 때 66600, 166600과 같은 경우
		}
		
		System.out.println(result);
		
	}
	
	// String -> int 변환
	public static int nt(String num) {
		int result = Integer.parseInt(num);
		return result;
	}
	
	// int -> String 변환
	public static String st(int num) {
		String result = String.valueOf(num);
		return result;
	}
	
	// 숫자 끝자리 추출하기
	public static int last(int num) {
		int result = st(num).charAt((st(num).length()));
		return result;
	}
	
	// 숫자 첫자리 추출하기
	public static int first(int num) {
		int result = st(num).charAt(0);
		return result;
	}
}