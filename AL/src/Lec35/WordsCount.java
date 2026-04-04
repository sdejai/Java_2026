package Lec35;

import java.util.StringTokenizer;

public class WordsCount {
	public static void main(String[] args) {
		String str="I am an Engineer";
		StringTokenizer st = new StringTokenizer(str," ");
		int count=0;
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			count++;
		}
		System.out.println(count);
	}
}
