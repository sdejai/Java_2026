package Lec33;

import java.util.Scanner;

public class LowerCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();//AMiT
		String result="";//amit
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z') {
				char chS=(char)(ch+32);
				result=result+chS;
			}
			else {
				result=result+ch;
			}
		}
		System.out.println(result);
	}
}
