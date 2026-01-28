package Lec9;

public class OpratorsAssignment {
	public static void main(String[] args) {
		
//		Assignment operators
		
		int mks=33;
		int grMks=8;
//		mks=mks+grMks;
		mks+=grMks;
		System.out.println(mks);
		int number =10;
		System.out.println(number);//10
		System.out.println(number++);//10
		System.out.println(number);//11
		System.out.println(++number);//12
		int num1=120;
		int num2=120;
		int num3=198;
//		Ternary operator
		int res=(num1>=num2&& num1>=num3)?num1:(num2>=num3 && num2>=num1?num2:num3);
		System.out.println(res);
	}
}
