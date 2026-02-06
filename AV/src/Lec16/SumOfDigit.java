package Lec16;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number =sc.nextInt();//456(4+5+6)
		int sumOfDigit=0;
		for(;number>0;) {
			int digit =number%10;//6 //5
			number=number/10;//45 //4
			sumOfDigit=sumOfDigit+digit;//6 //5  (6+5)
		}
		System.out.println(sumOfDigit);
	}
}
