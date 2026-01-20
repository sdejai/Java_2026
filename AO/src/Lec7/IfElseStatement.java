package Lec7;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputNumber =sc.nextInt();
		if(inputNumber%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}

}
