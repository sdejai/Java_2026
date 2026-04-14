package Lec6;

public class TwoSum {
	public static void main(String[] args) {
		int arr[]= {8,5,7,10,2};
		int target=9;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(arr[i]+" "+arr[j]);
					return;
				}
			}
		}

	}
}
