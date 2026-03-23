package Lec25;

public class MoveZero {
	public static void main(String[] args) {
		int nums[]= {0,1,0,3,12};
		int result[]=new int[nums.length];// 1 3 12 0  0
		int indexOfResult=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				result[indexOfResult]=nums[i];
				indexOfResult++;
			}
		}
		while(indexOfResult<nums.length) {
			result[indexOfResult]=0;
			indexOfResult++;
		}
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}
}
