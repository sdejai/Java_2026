package Lec6;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		int intNumber=10;
		Scanner sc = new  Scanner(System.in);
		byte byteNumber = sc.nextByte();
		short shortNumber = sc.nextShort();
		int number =sc.nextInt();
		long longNumber = sc.nextLong();
		float floatNumber = sc.nextFloat();
		double doubleNumbe =sc.nextDouble();
//		char charater =sc.nextChar();
		boolean bool =sc.nextBoolean();
		System.out.println(" User given number is "+byteNumber);
		System.out.println(" User given number is "+shortNumber);
		System.out.println(" User given number is "+number);
		System.out.println(" User given number is "+longNumber);
		System.out.println(" User given number is "+floatNumber);
		System.out.println(" User given number is "+doubleNumbe);
		System.out.println(" User given statement is "+bool);
	}
}
