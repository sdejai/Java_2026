package Lec9;

public class IsomorphicString {//s1 paper  s2 title
	public static boolean checkIsomorphic(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		
		for(int k=0;k<s1.length();k++) {
			char ch1=s1.charAt(k);//p
			char ch2=s2.charAt(k);//t
			
			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i)==ch1 && ch2!=s2.charAt(i)) {
					return false;
				}
				if(s2.charAt(i)==ch2 && ch1!=s1.charAt(i)) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String s="paper";
		String t="title";
//		boolean result=checkIsomorphic(s,t);
//		System.out.println(result);
		System.out.println(checkIsomorphic(s,t));
		
	}
}
