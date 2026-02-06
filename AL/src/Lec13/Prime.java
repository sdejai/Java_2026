package Lec13;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		if(num<=1) {
			System.out.println("Not Prime");
			return;
		}
		for(int check=2;check<num;check++) {
			if(num%check==0) {
				System.out.println("Not Prime");
				return;
			}
		}
		System.out.println("Prime");
	}
}
