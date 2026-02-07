package Lec14;

public class PalindromNUmber {
	public static boolean isPalindrome(int x){
		if(x<0) {
			return false;
		}
		int temp=x;
		int revNum=0;
		while(x!=0) {
			int digit =x%10;
			x=x/10; //x/=10;
			revNum=revNum*10+digit;
//			System.out.println(x);
		}
		if(revNum==temp) {
			return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome(-121));
	}
}
