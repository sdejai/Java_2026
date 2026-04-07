package Lec8;

import java.util.Scanner;

public class ArrayString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len=sc.nextInt();
		sc.nextLine();
		String arr[] = new String[len];
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextLine();
		}
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
