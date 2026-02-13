package Lec18;

public class ArmstromNumber {
	public static void main(String[] args) {
		int num = -153;
		if (num < 0) {
			System.out.println("false");
			return;
		}
		int check = num;
		int degree = 0;
		int org = num;
		while (num != 0) {
			num /= 10;
			degree++;
		}
//		System.out.println(degree);
		int product = 1;
		int sum = 0;
		while (org != 0) {
			int digit = org % 10;
			product = (int) Math.pow(digit, degree);
			sum = sum + product;
//			System.out.println(product);
			org /= 10;
		}
		System.out.println(sum == check);

	}
}
