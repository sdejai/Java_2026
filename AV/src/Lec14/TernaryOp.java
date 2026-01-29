package Lec14;

public class TernaryOp {
	public static void main(String[] args) {
//		Assignment op
		int pankaj = 500;
		int aman = 71;
//		aman=aman+pankaj;
		aman += pankaj;
		System.out.println(aman);
		System.out.println(pankaj);

//		Ternary op
//		condi ? condi true : condi false
//		Even Odd
		System.out.println(aman % 2 == 0 ? "even" : "odd");

//		Greater Element
		int num1 = 256;
		int num2 = 234567;
		int num3 = 13434567;
//		two number
		int res = num1 > num2 ? num1 : num2;
//		System.out.println(res);
//		System.out.println(num1 > num2 ? num1 : num2);
//		Three Element
		int result=(num1>=num2 && num1>=num3) ? num1 : (num2>=num1 && num2>=num3 ? num2:num3);
		System.out.println(result);
		
		
		
	}
}
