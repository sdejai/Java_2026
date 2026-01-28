package Lec12;

public class TernaryOp {
	public static void main(String[] args) {
		int num1 = 131;
		int num2 = 5432;
		int num3 = 12340;
//		if (num1 > num2) {
//			System.out.println(num1);
//		} else {
//			System.out.println(num2);
//		 }
//		ternary Op
//		 cond ? cond true : cond false
		int res = num1 > num2 ? num1 : num2;
		System.out.println(res);
		System.out.println(num2 % 2 == 0 ? "Even" : "Odd");

		int result = (num1 >= num2 && num1 >= num3) ? num1 : ((num2 >= num1 && num2 >= num3) ? num2 : num3);

		System.out.println(result);

	}
}
