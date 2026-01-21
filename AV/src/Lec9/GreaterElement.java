package Lec9;

import java.util.Scanner;

public class GreaterElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 =sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		if(num1>=num2 && num1>=num3) {
			System.out.println("Greatest Element is "+num1);
		}
		else if(num2>=num1 && num2>=num3) {
			System.out.println("Greatest Element is "+num2);
		}
		else {
			System.out.println("Greatest Element is "+num3);
		}
	}
}
