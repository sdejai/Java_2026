package Lec30;

public class PlaindromString {
	public static void main(String[] args) {
		String str="awa";
		int st=0;
		int end=str.length()-1;
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(1));
//		System.out.println(str.charAt(2));
//		System.out.println(str.length());
//		
//		for(int i=0;i<str.length();i++) {
//			System.out.println(str.charAt(i));
//		}
		
		
		while(st<end) {
			if(str.charAt(st)!=str.charAt(end)) {
				System.out.println("Not Palindrom");
				return;
			}
			st++;
			end--;
		}
		System.out.println("Plaindrome");
	}
}
