package Lec19;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int maxm=num1>num2?num1:num2;
		for(int i=maxm;i<=num1*num2;i++) {
			if(i%num1==0 && i%num2==0) {
				System.out.println("LCM of "+num1 +" and "+ num2+" is "+i);
				return;
			}
		}
	}
}
