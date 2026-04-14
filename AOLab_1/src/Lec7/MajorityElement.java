package Lec7;

public class MajorityElement {
	public static int majorityElement(int[] nums) {
	       int n=nums.length;
	       int maxCount=0;
	       int majorityElement=-1;
	       for(int searchCount=0;searchCount<nums.length;searchCount++){
	        int count=0;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]==nums[searchCount]){
	                count++;//count=count+1;
	            }
	        }
	        if(count>maxCount){
	            maxCount=count;
	            majorityElement=nums[searchCount];
	        }
	       }
	       if(maxCount>n/2){
	            return majorityElement;
	       }
	       return -1;
	    }
	public static void main(String[] args) {
		int nums[]= {3,2,3};
		System.out.println(majorityElement(nums));
	}
}
