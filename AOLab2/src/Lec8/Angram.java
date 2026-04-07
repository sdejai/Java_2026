package Lec8;

import java.util.Arrays;

public class Angram {
	public static void main(String[] args) {
		String s1="racc";
		String s2="car";
		if(s1.length()!=s2.length()) {
			System.out.println("Not angram");
			return;
		}
		char arr1[] = new char [s1.length()];
		char arr2[] = new char [s2.length()];
		for(int i=0;i<s1.length();i++) {
			arr1[i]=s1.charAt(i);
//			arr1[0]=s1.charAt(0);//r
//			arr1[1]=s1.charAt(1);//a
//			arr1[2]=s1.charAt(2);//t
		}
		for(int i=0;i<s2.length();i++) {
			arr2[i]=s2.charAt(i);
		}
		Arrays.sort(arr1);// a c r
		Arrays.sort(arr2);// a c r
		for(int i=0;i<s1.length();i++) {
			if(arr1[i]!=arr2[i]){
				System.out.println("Not Angram");
				return;
			}
		}
		System.out.println("Angram");
	}
}
