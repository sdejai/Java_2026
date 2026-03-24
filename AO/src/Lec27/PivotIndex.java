package Lec27;

public class PivotIndex {
	public static void main(String[] args) {
		int nums[]= {1,7,3,6,9,6};
		int totalSum=0;
		for(int i=0;i<nums.length;i++) {
			totalSum+=nums[i];
		}
		int leftSum=0;
		int rightSum=0;
		for(int pi=0;pi<nums.length;pi++) {
			
			rightSum=totalSum-leftSum-nums[pi];
			
			if(leftSum==rightSum) {
				System.out.println(pi);
				return;
			}
			leftSum=leftSum+nums[pi];
		}
		System.out.println("-1");
	}
}
