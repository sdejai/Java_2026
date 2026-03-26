package Lec31;

public class SumOf2DArray {
	public static void main(String[] args) {
		int nums[][]= {{5,2,1},{8,11,3}};
		int sum=0;
		for(int row=0;row<nums.length;row++) {
			for(int col=0;col<nums[0].length;col++) {
				sum=sum+nums[row][col];
			}
		}
		System.out.println(sum);
	}
}
