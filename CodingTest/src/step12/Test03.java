package step12;

import java.util.Scanner;

/*
 * 날짜 : 2023/07/24
 * 이름 : 한상민
 * 내용 : 19532. 수학은 비대면강의입니다.
 */
public class Test03 {
	public static void main(String[] args) {
		
		/*  경우의 수
		 * 1. c나 f가 0일 때 
		 *  a & d가 
		 */
		
		
		// x,y 선언
		int x = 0;
		int y = 0;
		
		
		// 값 6개 입력
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		
		// 계산
		if(a == 0) {
			y = c/b;
		}
		
		
		x = (c*e - b*f) / (a*e - b*d);
		y = (c*d - a*f) / (b*d - a*e);
		
		System.out.println(x + " " + y);
		
		/*
		 * ax + by = c
		 * dx + ey = f
		 * 
		 * adx + bdy = cd
		 * adx + aey = af
		 * 
		 * aex + bey = ce
		 * bdx + bey = bf
		 * 
		 * x = (ce - bf) / (ae - bd);
		 * y = (cd - af) / (bd - ae);
		 * 
		 */
	
	}
}
