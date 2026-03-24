package Lec23;

public class reverseArray {
	public static void main(String[] args) {
		int arr[]= {5,2,3,50,30,1};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int st=0;
		int end=arr.length-1;
		while(st<end) {
			int temp=arr[st];
			arr[st]=arr[end];
			arr[end]=temp;
			st++;
			end--;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}
}
