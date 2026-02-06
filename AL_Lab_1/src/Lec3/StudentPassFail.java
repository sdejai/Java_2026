package Lec3;

import java.util.Scanner;

public class StudentPassFail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float marksStudent=sc.nextFloat();
		if(marksStudent>=40) {
			System.out.println("Student Pass!");
		}
		else {
			System.out.println("Student Fail!");
		}
	}
}
