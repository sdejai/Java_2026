package Lec36;

public class Angram {
	public static void main(String[] args) {
		String str1="catt";
		String str2="tac";
		int frq1[]=new int[26];
		int frq2[]=new int[26];
		if(str1.length()!=str2.length()) {
			System.out.println("Not angram");
			return;
		}
		for(int i=0;i<str1.length();i++) {
			frq1[str1.charAt(i)-'a']++;//frq1[str1.charAt(i)-'a']=frq1[str1.charAt(i)-'a']+1
		}
		for(int i=0;i<str2.length();i++) {
			frq2[str2.charAt(i)-'a']++;
		}
		for(int i=0;i<26;i++) {
			if(frq1[i]!=frq2[i]) {
				System.out.println("Not angram");
				return;
			}
		}
		System.out.println("Angram");
	}
}
