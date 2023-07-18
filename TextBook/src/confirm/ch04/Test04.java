package confirm.ch04;

public class Test04 {
	public static void main(String[] args) {
		
		while(true) {
			
			int dice1 = (int) Math.ceil((Math.random() * 6));
			int dice2 = (int) Math.ceil((Math.random() * 6));
			
			if(dice1 + dice2 == 5) {
				System.out.printf("(%d, %d)", dice1, dice2);
				break;
			}
			
			System.out.printf("(%d, %d)", dice1, dice2);
		}
	}
}