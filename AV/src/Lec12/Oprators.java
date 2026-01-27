package Lec12;

public class Oprators {
	public static void main(String[] args) {
//		Arithmetic Op
		int  num1=184;
		int num2=2;
		System.out.println("+ op "+ (num1+num2));//186
		System.out.println("- op "+ (num1-num2));//182
		System.out.println("/ op "+ (num1/num2));//92
		System.out.println("* op "+ (num1*num2));//368
		System.out.println("% op "+ (num1%num2));//0
		
//		Relational(Compair) OP
		System.out.println(num1>num2);//true
		System.out.println(num1<num2);//false
		int number1=90;
		int number2=90;
		System.out.println(number1>=number2);//true
		number2=10;
		System.out.println(number1<=number2);//false
		System.out.println(90!=10);//true
		System.out.println(number1!=number2);//true
		System.out.println(number1==number2);//false
		
//		Logical Op
		boolean bool1=true;
		boolean bool2=true;
		System.out.println(!bool2);
		System.out.println(bool1 && bool2);
		if(bool1 && bool2) {
			System.out.println("Hey");
		}
		else {
			System.out.println("Hello");
		}
		int intNum1=13;
		int intNum2=14;
		int intNum3=5;
		if(intNum1>intNum2 || intNum1>intNum3) {
			System.out.println(intNum1);
		}
		System.out.println(4&4);
		System.out.println(4|2);
	}
}
