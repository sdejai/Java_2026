package Lec11;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		for(int i=1;i<=10;i=i+1) {
			System.out.print(i+" ");
		}
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		for(int i=0;i<=num;i++) {
			if(i%2!=0) {
				count=count+1;
			}
		}
		System.out.println(count);
	}
}
