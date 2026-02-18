package Lec21;

import java.util.Scanner;

public class UserInputArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int len=sc.nextInt();
		int arr[]=new int[len];
//		arr[0]=sc.nextInt();
//		arr[1]=sc.nextInt();
//		arr[2]=sc.nextInt();
		
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
