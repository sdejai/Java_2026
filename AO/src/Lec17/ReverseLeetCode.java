package Lec17;

public class ReverseLeetCode {
	public static int reverseInteger(int x) {
		long rev=0;
		for(;x!=0;x=x/10) {
			int digit =x%10;
			rev=rev*10+digit;
		}
		if(Integer.MAX_VALUE>=rev && rev>=Integer.MIN_VALUE) {
			return (int)rev;
		}
		return 0;
		
	}
	public static void main(String[] args) {
		int number=123;
		System.out.println(reverseInteger(number));
	}
}
