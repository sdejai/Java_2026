package Lec26;

public class SecondLargestElement {
	public static void main(String[] args) {
		int arr[]= {10,1,5,8,34,60};
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
