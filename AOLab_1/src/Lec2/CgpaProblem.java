package Lec2;

import java.util.Scanner;

public class CgpaProblem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float studentCgpa = scanner.nextFloat();
//		studentCgpa>=9 bike
//		8<=studentCgpa<9 iPhone
//		7<=studentCgpa<8 Nokia
//  	6<=studentCgpa<7 Dinner in 3 Star
//		studentCgpa<6 Better luck Next time

		if (studentCgpa >= 9) {
			System.out.println("You will get a Bike");
		}else if (8 <= studentCgpa && studentCgpa < 9) {
			System.out.println("You will get an iphone");
		} else if (7 <= studentCgpa && studentCgpa < 8) {
			System.out.println("You will get a Nokia");
		}
		else if(6<=studentCgpa && studentCgpa<7) {
			System.out.println("We will go for a dinner");
		}
		else {
			System.out.println("Better luck Next time");
		}
//		else {
//			System.out.println("You will not geting a Bike");
//		}
		////		if(studentCgpa==9.3f) {
////			System.out.println("hello");
////		}
	}
}
