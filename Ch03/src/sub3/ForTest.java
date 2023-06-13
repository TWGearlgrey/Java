package sub3;

/*
 * 날짜 : 2023/06/13
 * 이름 : 한상민
 * 내용 : Java 반복문 for 실습하기
 */
public class ForTest {
	public static void main(String[] args) {

		//1. for ~~ for(1초기식(변수) ; 25조건식 ; 47증강식) {36}
		for(int i=1 ; i<=5 ; i++) {
			System.out.println("i : " + i);
		}
		
		
		//2. 1부터 10까지 합
		int sum = 0;
		
		for(int k=1 ; k<=10 ; k++) {
			sum += k; // 'sum = sum + k;'
		}
			System.out.println("1부터 10까지 합 : " + sum);
		
			
		//3. 1부터 10까지 짝수합
		int tot = 0;
		
		for(int k=1 ; k<=10 ; k++) {
			if(k % 2 == 0) {
				tot += k;
			}
		}
				System.out.println("1부터 10까지 짝수 합 : " + tot);
			
			
		//4. for 중첩
		for(int a=1 ; a<=3 ; a++) {			
			System.out.println("a : " + a);			
			for(int b=1 ; b<=5 ; b++) {				
				System.out.println("b : " + b);				
				for(int c=1 ; c<=2 ; c++) {
					System.out.println("c : " +c);
				}
			}
		}
				
				
		//5. 구구단
		for(int x=2 ; x<=9 ; x++) {
			System.out.println(x+"단");
			for(int y=1 ; y<=9 ; y++) {
				int z = x * y;
				System.out.printf("%d x %d = %d\n", x, y, z); // '\n'은 개행처리다.
			}
		}
		
		
		//6. 별삼각형
		for(int start=1 ; start <= 10 ; start++) {
			for(int end=1 ; end <= start ; end++) {
				System.out.print("★");
			}
			System.out.print("\n"); //개행(줄바꿈)
		}
		
		
		//7. 별역삼각형
		for(int start=10 ; start >= 1 ; start--) {
			for(int end=1 ; end <= start ; end++) {
				System.out.print("★");
			}
			System.out.print("\n"); //개행(줄바꿈)
		}
		
		
		
	}
}
