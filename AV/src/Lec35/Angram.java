package Lec35;

public class Angram {
	public static void main(String[] args) {
		String s1="cat";
		String s2="tat";
		int s1Freq[]=new int[26];
		int s2Freq[]=new int[26];
		if(s1.length()!=s2.length()) {
			System.out.println("Not Angram!");
			return;
		}
		
		for(int i=0;i<s1.length();i++) {
			s1Freq[s1.charAt(i)-'a']++;//s1Freq[s1.charAt(i)-'a']=s1Freq[s1.charAt(i)-'a']+1;
		}
		for(int i=0;i<s2.length();i++) {
			s2Freq[s2.charAt(i)-'a']++;
		}
		for(int i=0;i<26;i++) {
			if(s1Freq[i]!=s2Freq[i]){
				System.out.println("Not Angram!");
				return;
			}
		}
		System.out.println("Angram");
	}
}
