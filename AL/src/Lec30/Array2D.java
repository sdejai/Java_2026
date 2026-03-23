package Lec30;

import java.util.Scanner;

public class Array2D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr1[][] = {{12,23},{1,2},{45,76}};
//		int row=sc.nextInt();//3
//		int col=sc.nextInt();//3
//		int arr[][]=new int[row][col];
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<col;j++) {
//				arr[i][j]=sc.nextInt();
//			}
//		}
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[0].length;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[0].length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}
}
