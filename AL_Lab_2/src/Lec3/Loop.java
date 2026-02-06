package Lec3;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		int num=sc.nextInt();
		for(int kishan=1;  kishan<=num ; kishan=kishan+5 ) {
			System.out.print(kishan+" ");
		}
	}
}
