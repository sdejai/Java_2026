package Lec37;

import java.util.Arrays;

public class LongestCommonPreficSubstring {
	public static void main(String[] args) {
//		String arr[]= {"flower","flow","flight"};
		String arr[]= {"Hello","Hei","Hey"};
		Arrays.sort(arr);
		String first=arr[0];
		String last=arr[arr.length-1];
		int minLength=Math.min(first.length(), last.length());
//		String res="";
		int count=0;
		for(int i=0;i<minLength;i++){
			if(first.charAt(i)==last.charAt(i)) {
				count++;
//				res=res+first.charAt(i);
			}
			else {
				break;
			}
		}
		System.out.println(first.substring(0,count));
//		String str="RAM JI";
//		System.out.println(str.substring(0));
////		System.out.println(str.substring(1,3));
////		System.out.println(res);
	}	
}
