package test8;

import java.util.StringTokenizer;

/*
 * 날짜 : 2023/07/21
 * 이름 : 한상민
 * 내용 : 자바 총정리 연습문제
 * 
 * String 3가지
 *  - String
 *  - StringBuilder
 *  - StringTokenizer
 *  ~> 많은 양을 처리하기엔 StringBilder가 적합하다.
 */
public class Test01 {
	public static void main(String[] args) {
		
		String[] arr1 = {"Apple", "Banana", "Grape", "Orange"};
		String result1 = String.join("-", arr1);
		System.out.println("result1 : " + result1);
		
		String[] arr2 = result1.split("-");
		String result2 = String.join("", arr2);
		System.out.println("result2 : " + result2);
		
		String[] arr3 = result2.split("(?=[A-Z])");
		String result3 = String.join("^", arr3);
		System.out.println("result3 : " + result3);
		
		StringTokenizer st = new StringTokenizer(result3, "^");
		StringBuilder sb = new StringBuilder();
		
		while (st.hasMoreElements()) {
			//sb.append((String) st.nextElement()); <~ 내 답안
			sb.append(st.nextToken());
		}
		
		String result4 = sb.toString();
		System.out.println("result4 : " + result4);
	}
}
