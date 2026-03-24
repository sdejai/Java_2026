package Lec25;

public class MoveZeroes {
	public static void main(String[] args) {
		
		int nums[]= {0,1098,0,13,12,0};// 
		int resIndex=0;
		int result[]=new int[nums.length];//1098 13  // i=0,1
		
//		Non- Zero Element fill
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				result[resIndex]=nums[i];
				resIndex++;
			}
		}
//		filling Zero till last
		for(int i=resIndex;i<result.length;i++) {
			result[i]=0;
		}
//		Print the Result Array
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
			
	}
}
