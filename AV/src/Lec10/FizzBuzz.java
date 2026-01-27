package Lec10;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number%3==0) {
			if(number%5==0) {
				System.out.println("FizzBuzz");
			}
			else {
				System.out.println("Fizz");
			}
		}
		else if(number%5==0) {
			System.out.println("Buzz");
		}
		else {
			System.out.println(number);
		}
	}
}
