package Lec8;

import java.util.Scanner;

public class StringTravse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name=sc.nextLine();//RAM
//		System.out.println(name);
//		String name2=name;
//		System.out.println(name2);
		String revName="";//A
		
		for(int i=name.length()-1;i>=0;i--) {
			revName=revName+name.charAt(i);
		}
		System.out.println(revName);
//		Reverse Print 
//		String name="RAM";
//		for(int i=name.length()-1;i>=0;i--) {
//			System.out.print(name.charAt(i));
//		}
		
//		System.out.println(name.charAt(0));//R
//		System.out.println(name.charAt(1));//A
//		System.out.println(name.charAt(2));//M
		
//		 trvser char String 
//		for(int i=0;i<name.length();i++) {
//			System.out.println(name.charAt(i));
//		}
	}
}
