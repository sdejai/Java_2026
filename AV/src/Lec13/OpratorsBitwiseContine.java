package Lec13;

public class OpratorsBitwiseContine {
	public static void main(String[] args) {
		int num1=12;
		int num2=2;
		int res=num1&num2;
		System.out.println(res);
//		System.out.println(num1&num2);
		System.out.println(2^1);
		System.out.println(2^2);
		System.out.println(6^6);
		System.out.println(num1^num2);
		int num=5;
//		int result=num<<1;
		int result=num<<2;
		System.out.println(result);
		System.out.println(num>>1);
		System.out.println(num>>2);
		int number=10;
		System.out.println(~number);
	}
}
