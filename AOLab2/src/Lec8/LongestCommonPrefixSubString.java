package Lec8;

import java.util.Arrays;
public class LongestCommonPrefixSubString {
	public static void main(String[] args) {
		 String arr[] = {"flower","flow","flight"};
		 Arrays.sort(arr);
		 String first=arr[0];
		 String last=arr[arr.length-1];
		 int minLen= Math.min(first.length(), last.length());
		 int count=0;
		 for(int i=0;i<minLen;i++){
			 if(first.charAt(i)==last.charAt(i)) {
				 count++;
			 }
			 else {
				 break;
			 }
		 }
		 String res=first.substring(0,count);
		 System.out.println(res);
		 
	}
}
