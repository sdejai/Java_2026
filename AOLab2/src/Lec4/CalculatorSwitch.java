package Lec4;

import java.util.Scanner;

public class CalculatorSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		char opertorSign=sc.next().charAt(0);
		switch (opertorSign) {
		case '+':
			System.out.println(number1+number2);
			break;
		case '-': 
			System.out.println(number1-number2);
			break;
		case '*': 
			System.out.println(number1*number2);
			break;
		case '/': 
			System.out.println(number1/number2);
			break;
		case '%': 
			System.out.println(number1%number2);
			break;
		default:
			System.out.println("Invaild Opertor");
			break;
		}
		System.out.println("Switch case!");
	}
}
