package Lec5;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte bytNumber =sc.nextByte();
//		System.out.println("User given byte number is "+bytNumber);
		int intNumber =sc.nextInt();
		System.out.println(bytNumber + " " +intNumber);
//		System.out.println("User given int number is "+intNumber);
	}
}
