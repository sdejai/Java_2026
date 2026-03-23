package Lec27;

public class SingleNumber {
	   public static int singleNumber(int[] nums) {
	        int res=0;
	        for(int num:nums){
	            res=res^num;
	        }
	        return res;
	    }
	public static void main(String[] args) {
		int nums[]= {1,1,3,3,6,4,6,8,8};
		System.out.println(singleNumber(nums));
	}
}
