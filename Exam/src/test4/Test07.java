package test4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * 날짜 : 2023/06/30
 * 이름 : 한상민
 * 내용 : 리스트 연습문제
 */
public class Test07 {
	public static void main(String[] args) {
		
		// 60~ 100 사이 임의의 수 10개를 더하므로 결과값이 항상 다름
		printList(createList()); // f(x)에서 x가 먼저 실행 됨
	}
	
	public static void printList(List<Integer> scoreList) {
		
		int total = 0;
		int size = scoreList.size();
		
		for(int i=0 ; i<size ; i++) {
			
			int score = scoreList.get(i);
			
			total += score;
			
			System.out.print(score);
			
			if(i == size -1) {
				System.out.print(" = ");
			}else {
				System.out.print(" + ");
			}
		}
		System.out.println(total);
	}
	
	public static List<Integer> createList() { //반환형은 return을 따라간다.
		
		List<Integer> scoreList = new ArrayList<>();
		Random rand = new Random();
		
		for(int i=1 ; i<=10 ; i++) {
			// 60~100사이의 임의의 수
			int num = rand.nextInt(41)+60; // (1~40) + 60
			scoreList.add(num);
		}
		
		return scoreList; // return값 scoreList를 파악
	}
}
