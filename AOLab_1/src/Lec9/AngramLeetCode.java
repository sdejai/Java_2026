package Lec9;

public class AngramLeetCode {
	public static boolean vaildAngram(String s,String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		int arr1[]=new int[26];
		int arr2[]=new int[26];
		for(int i=0;i<s.length();i++) {
			arr1[s.charAt(i)-'a']++;
//			arr1[s.charAt(i)-'a']=arr1[s.charAt(i)-'a']+1;
		}
		for(int i=0;i<t.length();i++) {
			arr2[t.charAt(i)-'a']++;
		}
		for(int i=0;i<26;i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		String s="cata";
		String t="taca";
		System.out.println(vaildAngram(s,t));
	}
}
