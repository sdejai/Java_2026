package Lec23;

public class ReverseArray {
	public static void main(String[] args) {
		int arr[]= {10,16,18,25,1};//arr.length-1-i
		int arrResult[]=new  int[arr.length];//1 25 18 16 10
//		arrResult[0]=arr[arr.length-1];
//		System.out.println(arrResult[0]);
//		arrResult[1]=arr[arr.length-1-1];//-2
//		System.out.println(arrResult[1]);
//		arrResult[2]=arr[arr.length-1-2];//-3
//		System.out.println(arrResult[2]);
//		for(int i=0;i<arrResult.length;i++) {
//			arrResult[i]=arr[arr.length-1-i];//
//			System.out.print(arrResult[i]+" ");
//		}
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
