package ch01;

import java.util.Scanner;

public class Sub09_NaMeoJi {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		
		System.out.println(  (A + B) % C);
		System.out.println(( (A % C) + (B % C) ) % C);
		System.out.println(  (A * B) % C);
		System.out.println(( (A % C) * (B % C) ) % C);
		
		in.close();
		
	}
}