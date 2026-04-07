package Lec7;

public class LowerCase {
	public static void main(String[] args) {
		String str="AmiT Kumar";
		String result="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z') {
				char chLowerCase= (char) (ch+32);
				result=result+chLowerCase;
			}
			else {
				result=result+ch;
			}
		}
		System.out.println(result);
		String s="naman KumaR";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
	}
}
