package Lec29;

public class MissingNumber {
	public static int missingNumber(int nums[]){
		int n=nums.length;
		int totalSum=0;
		for(int i=0;i<n;i++) {
			totalSum+=nums[i];
		}
		int res=((n*(n+1))/2)-totalSum;
		return res;
	}
	public static void main(String[] args) {
		int nums[]= {0,1,3};
		
		System.out.println(missingNumber(nums));
	}
}
