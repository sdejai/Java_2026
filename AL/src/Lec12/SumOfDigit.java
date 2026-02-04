package Lec12;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userNumber=sc.nextInt();//58343
		int sum=0;
		while(userNumber>0) {
			int digit=userNumber%10;
			userNumber=userNumber/10;      
			sum=sum+digit;
		}
		System.out.println(sum);
	
	}
}
