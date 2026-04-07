package Lec9;

import java.util.Scanner;

public class StringArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len=sc.nextInt();//3
		sc.nextLine();
		String arr[] = new String[len];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextLine();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
}
