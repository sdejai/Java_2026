package Lec2;

import java.util.Scanner;

public class CgpaProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float studentCgpa=sc.nextFloat();
//		9<=studentCgpa bike
//		8<=studentCgpa<9 iphone
//		7<=studentCgpa<8 Nokia 
//		studentCgpa<=6 Better luck next time 
		if(studentCgpa>=0 && studentCgpa<=10) {
			if(studentCgpa>=9) {
				System.out.println("Bike");
			}
			else if(studentCgpa>=8 && studentCgpa<9) {
				System.out.println("iphone");
			}
			else if(studentCgpa>=7 && studentCgpa<8) {
				System.out.println("Nokia");
			}
			else {
				System.out.println("Better luck next time");
			}
		}
		else {
			System.out.println("Invaild CGPA");
		}
		
	}
}
