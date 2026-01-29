package Lec10;

import java.util.Scanner;

public class CheckPostiveNegative {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int number=sc.nextInt();
		int number =0;
		if(number>0) {
			System.out.println("postive "+number);
		}
		else if(number<0) {
			System.out.println("negative "+number);
		}
		else {
			System.out.println("Zero "+number);
		}
	}
}
