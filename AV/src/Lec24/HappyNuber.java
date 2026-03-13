package Lec24;

public class HappyNuber {
	public static boolean isHappy(int n) {
		while(n!=1 && n!=4) {
			int sum=0;
			while(n>0) {
				int digit=n%10;
				sum=sum+(digit*digit);
				n=n/10;
			}
			n=sum;
		}
		if(n==1) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(isHappy(1));
		float ft=12.456f;
		System.out.printf("%.1f",ft);
	}
}
