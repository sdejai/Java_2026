package Lec21;

public class UniqueDigit {
	public static void main(String[] args) {
		int n = -10;
		int arr[]= new int[10];
		if(n<0) {
			n=n*(-1);
		}
		if(n==0) {
			System.out.println("1");
			return;
		}
		while(n!=0) {
			int digit =n%10;
			n=n/10;
			++arr[digit];
		}
		int count=0;
		for(int i=0;i<10;i++) {
			if(arr[i]!=0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
