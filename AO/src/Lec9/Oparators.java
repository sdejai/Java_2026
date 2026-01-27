package Lec9;

public class Oparators {
	public static void main(String[] args) {
		int num1=15;
		int num2=5;
//		Arthemetic 
		System.out.println("+ oprator "+(num1+num2));
		System.out.println("- oprator "+(num1-num2));
		System.out.println("* oprator "+(num1*num2));
		System.out.println("/ oprator "+(num1/num2));
		System.out.println("% oprator "+(num1%num2));
		
//		Relational
		System.out.println(num1>num2);//true
		System.out.println(num1<num2);//false
		System.out.println(num1==num2);//false
		System.out.println(num1!=num2);//true
		System.out.println(num1>=num2);//true
		System.out.println(num1<=num2);//false
		System.out.println("------------------");
		
//		logical Oprator
//		int number1=-5;
		int number1=5;
		int number2=6;
		
		System.out.println(true &&true);//true
		System.out.println(true &&false);//false
		System.out.println(true || true);//true
		System.out.println(false || true);//true
		System.out.println(!true);//false
		System.out.println(5&1);
		System.out.println(number1&number2);
		System.out.println(5|1);
		System.out.println(~number1);
		int num=2;
		System.out.println("Left shift "+(num<<1));
		System.out.println("Left shift "+(num<<2));
		System.out.println("Left shift "+(num<<3));
		System.out.println("right shift "+(num>>1));
	}
}
