package Lec32;

public class StringPrint {
	public static void main(String[] args) {
		String name = "Delhi";
//		for(int i=0;i<name.length();i++) {
//				System.out.print(name.charAt(i));
//		}
		for (int i = name.length()-1; i >=0 ; i--) {
			System.out.print(name.charAt(i));
		}

	}
}
