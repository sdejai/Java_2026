package Lec22;

public class GreastestElement {
	public static void main(String[] args) {
		int arr[]= {23,43,6,78,99};
		int greatestElement=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>greatestElement) {
				greatestElement=arr[i];
			}
		}
		System.out.println(greatestElement);
	}
}
