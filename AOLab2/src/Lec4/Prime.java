package Lec4;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number =sc.nextInt();
		if(number<=1) {
			System.out.println("Not Prime");
			return;
		}
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				System.out.println("Not Prime");
				return;
			}
		}
		System.out.println("Prime");
	}
}
