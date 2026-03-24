package Lec22_2;

public class SecondLargestElement {
	public static void main(String[] args) {
		int arr[]= {12,4,6,2,78,90};
		int firstLargest=Integer.MIN_VALUE;
		int secongLargest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>firstLargest) {
				firstLargest=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++ ) {
			if(arr[i]>secongLargest && arr[i]!=firstLargest) {
				secongLargest=arr[i];
			}
		}
		System.out.println(secongLargest);
	}
}
