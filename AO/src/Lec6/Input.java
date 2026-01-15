package Lec6;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte byteNumber = sc.nextByte();
		short shortNumber=sc.nextShort();
		int intNumber =sc.nextInt();
		long longNumber =sc.nextLong();
		float floatNumber =sc.nextFloat();
		double doubleNumber = sc.nextDouble();
		sc.nextLine();
//		char charater= sc.nextChar();//method * (not allowed)
		
		char charater= sc.nextLine().charAt(0);
		boolean bool =sc.nextBoolean();
		
		System.out.println(byteNumber);
		System.out.println(shortNumber);
		System.out.println(intNumber);
		System.out.println(longNumber);
		System.out.println(floatNumber);
		System.out.println(doubleNumber);
		System.out.println(charater);
		System.out.println(bool);
		
	}
}
