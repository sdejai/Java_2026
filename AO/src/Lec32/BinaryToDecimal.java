package Lec32;

public class BinaryToDecimal {
	public static void main(String[] args) {
		
//		If input in String 
		String s="0110";
		int i=s.length()-1;
		int decimalNumber=0;
		int power=1;
		while(i>=0) {
			int digit=s.charAt(i)-'0';
//			System.out.println(digit);
			decimalNumber=decimalNumber+(digit*power);
			power=power*2;
//			System.out.println(decimalNumber);
			i--;
		}
		System.out.println(decimalNumber);
		
		
//		int num=110;
//		int decimalNumber=0;
//		int power=1;
//		int i=0;
//		while(num>0) {
//			int digit=num%10;
////			System.out.println(digit);
//			decimalNumber=decimalNumber+(digit*power);
//			power=power*2;
////			decimalNumber=decimalNumber+(digit*(int)((Math.pow(2,i))));
//			num=num/10;
////			System.out.println(num);
////			i++;
//		}
//		System.out.println(decimalNumber);
	}
}
