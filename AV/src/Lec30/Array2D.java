package Lec30;

import java.util.Scanner;

public class Array2D {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[][] =new int[2][3];
		arr[0][0]=5;
		arr[0][1]=12;
		arr[0][2]=34;
		arr[1][0]=4;
		arr[1][1]=35;
		arr[1][2]=98;
		System.out.println(arr[0][0]);
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=sc.nextInt();
			}
			
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
