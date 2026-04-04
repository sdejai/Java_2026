package Lec37;

import java.util.Arrays;

public class PrefixLongestCommonSubString {
	public static void main(String[] args) {
		String str[]= {"Hey","Hei","Hello"};
		Arrays.sort(str);
		String first=str[0];
		String last=str[str.length-1];
		int minLen=0;
		if(first.length()<last.length()) {
			minLen=first.length();
		}
		else {
			minLen=last.length();
		}
		int count=0;
		for(int i=0;i<minLen;i++) {
			if(first.charAt(i)==last.charAt(i)) {
				count++;
			}
		}
		String result=first.substring(0, count);
		System.out.println(result);
		//Not Complete Explain and code too
	}
}
