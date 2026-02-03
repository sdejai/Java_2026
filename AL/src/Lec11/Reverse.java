package Lec11;

public class Reverse {
	public static void main(String[] args) {
		int num=12346;
		int rev=0;
		for(;num>0;) {
			int digit =num%10;
			num=num/10;
			rev=rev*10+digit;
		}
		System.out.println(rev);
	}
}
