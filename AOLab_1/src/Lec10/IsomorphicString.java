package Lec10;

public class IsomorphicString {
	public static boolean isIsomorphicString(String s,String t) {
		
		if(s.length()!=t.length()) {
			return false;
		}
		
		for(int k=0;k<s.length();k++) {
			char ch1=s.charAt(k);
			char ch2=t.charAt(k);
			for(int i=0;i<s.length();i++) {
				if(ch1==s.charAt(i) && ch2!=t.charAt(i)) {
					return false;
				}
				if(ch2==t.charAt(i) && ch1!=s.charAt(i)) {
					return false;
				}
			}
		}
		return true;	
	}
	public static void main(String[] args) {
		String s1="f11";
		String s2="b23";
//		boolean result= isIsomorphicString(s1, s2);
//		System.out.println(result);
		System.out.println(isIsomorphicString(s1, s2));
	}
}
