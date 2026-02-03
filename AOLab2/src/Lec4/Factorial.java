package Lec4;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int result=1;
		for(;num>0;num=num-1) {
			result=result*num;
		}
		for(int i=1;i<=num;i++) {
			result=result*i;
		}
//		while(num>0) {
//			result=result*num;
//			num=num-1;
//		}
		System.out.println(result);
	}
}
