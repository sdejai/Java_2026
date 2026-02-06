package Lec17;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int revNumber=0;
//		for(;num>0;num=num/10) {
//			int digit=num%10;
//			revNumber=revNumber*10+digit;
//		}
		while(num>0) {
			int digit=num%10;
			num=num/10;
			revNumber=revNumber*10+digit;
		}
		System.out.println(revNumber);
	}
}
