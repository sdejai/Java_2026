package Lec23;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int maxm=num1>num2?num1:num2;
//		System.out.println(maxm);
//		for(;maxm<=num1*num2;maxm++) {
//			
//		}
		for(int i=maxm;i<=(num1*num2);i++) {
			if(i%num1==0 && i%num2==0) {
				System.out.println(i);
				return;
			}
		}
		
	}
}
