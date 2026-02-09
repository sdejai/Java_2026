package Lec4;

public class PrimeNumber {
	public static void main(String[] args) {
		int number=7;
		if(number<=1) {
			System.out.println("Not Prime");
			return;
			
		}
		for(int check=2;check<number;check++) {
			if(number%check==0) {
				System.out.println("Not Prime");
				return;
			}
		}
		System.out.println("Prime");
	}
}
