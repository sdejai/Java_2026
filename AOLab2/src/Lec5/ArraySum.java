package Lec5;

import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();//4
		int arr[]=new int[n];// 3 4 6 9=22
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
//		sum=sum+arr[0];//(0+3)==3
//		sum=sum+arr[1];//(3+4)==7
//		sum=sum+arr[2];//(7+6)==13
//		sum=sum+arr[3];//(13+9)==22
		
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
		
	}
}
