package Lec34;

import java.util.Scanner;

public class LowerCase {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		String str=sc.nextLine();//AMit
		String result="";//ami
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z') {
				char chL=(char)(ch+32);
				result=result+chL;
			}
			else {
				result=result+ch;
			}
		}
		System.out.println(result);
	}
}
