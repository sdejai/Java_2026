package Lec8;

import java.util.Scanner;

public class InputRevision {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean boolVariable =sc.nextBoolean();
		System.out.println(boolVariable);
//		char charater=sc.next().charAt(0);
		sc.nextLine();
		char charater=sc.nextLine().charAt(0);
		System.out.println(charater);
	}
}
