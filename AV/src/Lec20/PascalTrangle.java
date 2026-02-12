package Lec20;

import java.util.Scanner;

public class PascalTrangle {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int row=0;
		int star=1;
		while(row<n) {
			int col=0;
			int nCr=1;
			while(col<star) {
				System.out.print(nCr+" ");
				nCr=((row-col)*nCr)/(col+1);
				col++;
			}
			System.out.println();
			star++;
			row++;
		}
	}
}
