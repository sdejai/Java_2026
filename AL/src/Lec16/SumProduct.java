package Lec16;

public class SumProduct {
	public static int subtractSumProduct(int n) {
		int sum = 0;
		int product = 1;

		while (n > 0) {
			int digit = n % 10;
			n = n / 10;
			sum = sum + digit;
			product = product * digit;
		}
//		int res=product-sum;
//		return res;
		return (product-sum);
	}

	public static void main(String[] args) {
		int n = 4421;
		System.out.println(subtractSumProduct(n));
	}
}
