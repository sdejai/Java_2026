package Lec4;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int  number =sc.nextInt();
		int result=1;
		for( int  number =sc.nextInt();number>=1;number--) {
			result=result*number;
		}
		System.out.println(result);
	}
}
