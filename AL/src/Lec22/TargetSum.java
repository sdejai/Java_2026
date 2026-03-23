package Lec22;

public class TargetSum {
	public static void main(String[] args) {
		int nums[]= {5,8,10,7,2};
		int target=9;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					System.out.println(nums[i]+" "+nums[j]);
				}
			}
		}
	}
}
