package Lec31;

public class SumOf2DArray {
	public static void main(String[] args) {
		int nums[][]= {{15,100,51},{1,2,5},{23,4,6}};
		int sum=0;
		for(int row=0;row<nums.length;row++) {
			for(int col=0;col<nums[1].length;col++) {
				sum=sum+nums[row][col];
			}
		}
		System.out.println(sum);
	}
}
