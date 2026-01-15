package Lec5;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
//		int number1=10;//hardCoded data
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		long longNumber =sc.nextLong();
		System.out.println("User Input Number "+number);
//		long longNumber =sc.nextLong();
		System.out.println("User Input Long Number "+ longNumber);
		byte byteNumber= sc.nextByte();
	}
}
