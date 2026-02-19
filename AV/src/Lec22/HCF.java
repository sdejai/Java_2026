package Lec22;

import java.util.Scanner;

public class HCF {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int min=num1<num2?num1:num2;
//		if(num1<num2) {
//			min=num1;
//		}
//		else {
//			min=num2;
//		}
		for(int i=min;i>=1;i--) {
			if(num1%i==0 && num2%i==0) {
				System.out.println(i);
				return;
			}
		}
	}
}
