package Lec3;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tableNum=sc.nextInt();
		for(int i=1;i<=10;i=i+1) {
			System.out.println(tableNum +"* "+i  +"="+ tableNum*i);
		}
//		System.out.println(tableNum +" *1 "  +"="+ tableNum*1);
//		System.out.println(tableNum +" *2 "  +"="+ tableNum*2);
//		
//		System.out.println(tableNum +" *3 "  +"="+ tableNum*3);
//		System.out.println(tableNum +" *4 "  +"="+ tableNum*4);
	}
}
