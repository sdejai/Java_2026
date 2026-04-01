package Lec8;

public class Binary {
	public static void main(String[] args) {
		int num=2;
		String rem="";
//		int i=0;
		while(num>0) {
			rem=rem+num%2;
			num=num/2;
//			i++;
		}
		for(int i=rem.length()-1;i>=0;i--) {
			System.out.print(rem.charAt(i));
		}
	}
}
