package Lec33;

import java.util.Scanner;

public class UpperCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();// AMiT
		String result = "";// amit
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				char chU = (char) (ch - 32);
				result = result + chU;
			} else {
				result = result + ch;
			}
		}
		System.out.println(result);
	}
}
