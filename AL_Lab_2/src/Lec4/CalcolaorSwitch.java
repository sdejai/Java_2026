package Lec4;

import java.util.Scanner;

public class CalcolaorSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();// 12
		int num2 = sc.nextInt();// 34
		char operChoices = sc.next().charAt(0);
		switch (operChoices) {
		case '+':
			System.out.println(num1 + num2);
			break;
		case '-':
			System.out.println(num1 - num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;
		case '/':
			System.out.println(num1 / num2);
			break;
		case '%':
			System.out.println(num1 % num2);
			break;
		default:
			System.out.println("Invaild operato!");
		}
	}
}
