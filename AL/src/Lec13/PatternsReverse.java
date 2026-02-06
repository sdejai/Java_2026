package Lec13;

import java.util.Scanner;

public class PatternsReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int row=0;row<n;row++) {
			for(int colSpace=0;colSpace<n-1-row;colSpace++) {
				System.out.print(" ");
			}
			for(int colStar=0;colStar<=row;colStar++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
