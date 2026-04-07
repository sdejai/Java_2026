package Lec6;

public class TwoSumLeetCode {
	public static int[] twoSum(int nums[],int target) {
		int result[]=new int[2];//0 1
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					result[0]=i;
					result[1]=j;
//					System.out.println(i+" "+j);
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int nums[]= {2,7,11,15};
		int target=9;
		twoSum(nums,target);
	}
}
