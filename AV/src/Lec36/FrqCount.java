package Lec36;

public class FrqCount {
	public static void main(String[] args) {
		String str="pparthhht";
		int arr[]= new int[26];
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)-'a']++;
		}
		for(int i=0;i<str.length();i++) {
			if(arr[str.charAt(i)-'a']!=-1) {
				System.out.println(str.charAt(i)+" count/frq is " + arr[str.charAt(i)-'a']);
				arr[str.charAt(i)-'a']=-1;
			}
			
		}
	}
}
