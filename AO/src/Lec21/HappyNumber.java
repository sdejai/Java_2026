package Lec21;

public class HappyNumber {
	public static void main(String[] args) {
		int n = 4;
		while (n != 1 && n != 4) {
			int sum = 0;
			while (n > 0) {
				int digit = n % 10;
				n = n / 10;
				sum = sum + digit * digit;
			}
			n = sum;
		}
		if (n == 1) {
			System.out.println("Happy Number");
		} else {
			System.out.println("Unhappy");
		}
	}
}
