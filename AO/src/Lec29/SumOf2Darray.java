package Lec29;

public class SumOf2Darray {
	public static void main(StringCreate[] args) {
		int nums[][]= {{5,11,8},{3,1,6},{4,7,9}};
		int sum=0;
		for(int row=0;row<nums.length;row++) {
			for(int col=0;col<nums[0].length;col++) {
				sum=sum+nums[row][col];
			}
		}
		System.out.println(sum);
	}
}
