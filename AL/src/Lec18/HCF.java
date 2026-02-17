package Lec18;

import java.util.Scanner;

public class HCF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		int min=number1<number2?number1:number2;
		for(int i=min;i>=1;i--) {
			if(number1%i==0 && number2%i==0) {
				System.out.println("HCF of "+number1+" and "+number2+" is "+i);
				return;
			}
		}
	}
}
