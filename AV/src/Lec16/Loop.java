package Lec16;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numTable =sc.nextInt();
//		System.out.println(numTable*1);
//		System.out.println(numTable*2);
//		System.out.println(numTable*3);
//		System.out.println(numTable*4);
//		System.out.println(numTable*5);
//		System.out.println(numTable*6);
//		System.out.println(numTable*7);
//		System.out.println(numTable*8);
//		System.out.println(numTable*9);
//		System.out.println(numTable*10);
//		i=i+1  (i+=1)
		for(int i=1;i<=10;i=i+1) {
			System.out.println(numTable*i);
		}
		
		
	}
}
