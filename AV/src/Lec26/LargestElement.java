package Lec26;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int len=sc.nextInt();
//		int arr[]=new int[len];
//		for(int i=0;i<len;i++) {
//			arr[i]=sc.nextInt();
//		}
//		int nums[]= {12,324,666,2564,12};
		int nums[] = { -2, -324, -666, -2564, -12, 3646, 2746,3646 };

		int lEement = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > lEement) {
				lEement = nums[i];
			}
		}
		System.out.println(lEement);
		
//		Arrays.sort(nums);
//		for(int i=0;i<nums.length;i++) {
//			System.out.print(nums[i]+" ");
//		}
	}
}
