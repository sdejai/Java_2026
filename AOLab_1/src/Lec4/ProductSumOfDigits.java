package Lec4;

public class ProductSumOfDigits {
	public  static int subtractProductAndSum(int n) {
        int productOfNumber=1;
        int sumOfNumber=0;
        while(n!=0){
            int digit=n%10;
            n/=10;
            productOfNumber*=digit;
            sumOfNumber+=digit;
        }
        return (productOfNumber-sumOfNumber);
    }
	public static void main(String[] args) {
		int number=234;
		System.out.println(subtractProductAndSum(number));
	}
}
