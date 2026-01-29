package Lec10;

public class SwapTwoNumber {
	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 4;
		int temp = 0;
		System.out.println("Before swap numbers are " + num1 + " and " + num2);
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After swap numbers are " + num1 + " and " + num2);
	}
}
