package Lec30;

public class PivotIndex {
	public static int pivotIndex(int nums[]) {
		int totalSum=0;
		for(int i=0;i<nums.length;i++) {
			totalSum+=nums[i];
		}
		int leftSum=0;
		int rightSum=0;
		for(int pi=0;pi<nums.length;pi++) {
//			leftSum=leftSum+nums[pi-1];
			rightSum=totalSum-leftSum-nums[pi];
			if(leftSum==rightSum) {
				return pi;
			}
			leftSum=leftSum+nums[pi];
		}
		return -1;
	}
	public static void main(String[] args) {
		int nums[]= {1,7,3,6,5,6};
		System.out.println(pivotIndex(nums));
	}
}
