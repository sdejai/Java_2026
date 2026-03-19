package Lec27;

import java.util.Scanner;

public class TargetSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len=sc.nextInt();
		int nums[]=new int[len];
		for(int i=0;i<len;i++) {
			nums[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(nums[i]+nums[j]==target){
					System.out.println(nums[i]+" "+nums[j]);
				}
			}
		}
		
	}
}
