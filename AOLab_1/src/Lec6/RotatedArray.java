package Lec6;

public class RotatedArray {
	public static void main(String[] args) {
		int arr[]= {12,34,90,55,355,8};
		int k=4;
		for(int rot=1;rot<=k;rot++) {
			int temp=arr[arr.length-1];
			for(int i=arr.length-1;i>=1;i--) {
				arr[i]=arr[i-1];
			}
			arr[0]=temp;
		}
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
