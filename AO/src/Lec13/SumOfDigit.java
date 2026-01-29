package Lec13;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number= sc.nextInt();
		int sumOfDig=0;
		while(number>0) {
			int digit=number%10;
			number/=10;//number=number/10;
			sumOfDig+=digit;
		}
		System.out.println(sumOfDig);
	}
}
