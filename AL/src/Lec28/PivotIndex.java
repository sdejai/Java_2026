package Lec28;

public class PivotIndex {
	public static void main(String[] args) {
		int nums[]= {1,7,3,6,5,6};
		int totalSum=0;
		for(int i=0;i<nums.length;i++) {
			totalSum+=nums[i];
		}
		int leftSum=0;
		int rightSum=0;
		for(int pI=0;pI<nums.length;pI++) {
			leftSum=leftSum+nums[pI-1];
			rightSum=totalSum-leftSum-nums[pI];
			if(leftSum==rightSum) {
				System.out.println(pI);
				return;
			}
		}
	}
}
