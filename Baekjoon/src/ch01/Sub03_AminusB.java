package ch01;

import java.util.Scanner;

public class Sub03_AminusB {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		
		if(A>0 && B>0) {
		
			System.out.println(A-B);
		
			in.close();
		}
	}
}
