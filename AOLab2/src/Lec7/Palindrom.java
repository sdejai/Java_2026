package Lec7;

public class Palindrom {
	public static void main(String[] args) {
		
		String str="ababb";
		int st=0;
		int end=str.length()-1;
		while(st<end) {
			if(str.charAt(st)!=str.charAt(end)) {
				System.out.println("Not Palindrome!");
				return;
			}
			st++;
			end--;
		}
		System.out.println("Palindrome");
	}
}
