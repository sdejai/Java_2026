package Lec5;

import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len=sc.nextInt();
		int arr[] = new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<len;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
}
