package Lec9;

import java.util.Arrays;

public class Angram {
	public static void main(String[] args) {
		String str1="rat";
		String str2="car";
//		str1=str1.toLowerCase();
//		str2=str2.toLowerCase();
		if(str1.length()!=str2.length()) {
			System.out.println("Not angram");
			return;
		}
		char strArr1[]=new char[str1.length()];// r a t  [a r t]
		char strArr2[]=new char[str2.length()]; //c a r  [a c r]
		for(int i=0;i<str1.length();i++) {
			strArr1[i]=str1.charAt(i);
		}
		for(int i=0;i<str2.length();i++) {
			strArr2[i]=str2.charAt(i);
		}
		Arrays.sort(strArr1);
		Arrays.sort(strArr2);
		for(int i=0;i<strArr1.length;i++) {
			if(strArr1[i]!=strArr2[i]){
				System.out.println("Not angram");
				return;
			}
		}
		System.out.println("Angram");
	}
}
