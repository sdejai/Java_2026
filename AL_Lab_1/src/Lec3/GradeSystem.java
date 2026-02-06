package Lec3;

import java.util.Scanner;

public class GradeSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float marks=sc.nextFloat();
		if(marks>100) {
			System.out.println("invaild Marks");
//			return;
		}
		else if(marks>=90 && marks<=100) {
			System.out.println("O");
		}
		else if(marks>=80 && marks<90) {
			System.out.println("A+");
		}
		else if(marks>=70 && marks<80){
			System.out.println("A");
		}
		else if(marks>=60 && marks<70){
			System.out.println("B+");
		}
		else if(marks>=50 && marks<60){
			System.out.println("B");
		}
		else if(marks>=40 && marks<50){
			System.out.println("C");
		}
		else {
			System.out.println("Fail");
		}
	}
}
