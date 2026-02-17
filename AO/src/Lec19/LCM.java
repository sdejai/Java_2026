package Lec19;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		int maxm=number1>number2?number1:number2;
		for(int i=maxm;i<=number1*number2;i++) {
			if(i%number1==0 && i%number2==0) {
				System.out.println("LCM of "+number1 +" and "+ number2+" is "+i);
				return;
			}
		}
	}
}
