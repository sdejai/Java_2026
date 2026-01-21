package Lec6;

import java.util.Scanner;

public class CharInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		byte byteNumber=sc.nextByte();
		short shortNumber=sc.nextShort();
		int intNumber =sc.nextInt();
		long longNumber = sc.nextLong();
		float floatNumber=sc.nextFloat();
		double doubleNumber =sc.nextDouble();
//		char charater =sc.nextChar();//Not a Method/function 
		sc.nextLine();
		char charater =sc.nextLine().charAt(0);
//		System.out.println(charater);
		boolean bool =sc.nextBoolean();
		System.out.println(byteNumber+" "+shortNumber+" "+intNumber+" "+longNumber+" "+floatNumber+" "+doubleNumber+" "+charater+" "+bool);
		

	}
}
