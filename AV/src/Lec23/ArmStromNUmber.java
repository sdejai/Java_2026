package Lec23;

import java.util.Scanner;

public class ArmStromNUmber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number =sc.nextInt();
		int tempNum=number;
		int check=number;
		int degree=0;
		while(tempNum>0) {
			tempNum/=10;
			degree++;
		}
		int sum=0;
		while(number>0) {
			int digit=number%10;
			number/=10;
			sum=sum+(int)(Math.pow(digit, degree));
		}
		if(sum==check) {
			System.out.println("ArmStrom");
		}
		else {
			System.out.println("Not ArmStrom");
		}
	}
}
