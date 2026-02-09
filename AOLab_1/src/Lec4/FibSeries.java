package Lec4;

public class FibSeries {
	public  static int fib(int n) {
		int num1 = 0;
		int num2 = 1;
		for (int i = 0; i < n; i++) {
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
		return num1;
	}

	public static void main(String[] args) {
		int number=3;
		System.out.println(fib(number));
	}
}
