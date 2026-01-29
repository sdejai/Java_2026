package Lec13;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number =sc.nextInt();
		int revNumber=0;
		for(;number>0;) {
			int digit =number%10;
			number=number/10;
			revNumber=revNumber*10+digit;
		}
		System.out.println(revNumber);
		
	}
}
