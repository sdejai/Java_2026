package Lec7;

import java.util.Scanner;

public class StringBe {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		String str=sc.nextLine();//RAM
		
		String str2="";
		for(int i=str.length()-1;i>=0;i--) {
			str2=str2+str.charAt(i);
		}
		System.out.println(str);
		System.out.println(str2);
//		
//		
//		for(int i=0;i<str.length();i++) {
//			System.out.println(str.charAt(i));
//		}
//		for(int i=str.length()-1;i>=0;i--) {
//			System.out.println(str.charAt(i));
////			System.out.print(str.charAt(i));
//		}
		
	}
}
