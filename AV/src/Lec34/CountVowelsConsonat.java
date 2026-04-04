package Lec34;

public class CountVowelsConsonat {
	public static void main(String[] args) {
		String str="I am an ,,  Engineer";
		str=str.toLowerCase();
		int countVow=0;
		int countCon=0;
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			if(ch>='a' && ch<='z') {
				if(ch=='a' || ch=='e' ||ch=='i' || ch=='o' ||ch=='u') {
					countVow++;
				}
				else {
					countCon++;	
				}
			}
		}
		System.out.println(countVow);
		System.out.println(countCon);
	}
}
