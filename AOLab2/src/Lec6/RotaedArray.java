package Lec6;

public class RotaedArray {
	public static void main(String[] args) {
		int nums[]= {12,425,3643,875,333};// 0 1 2 3 4
		int k=3;
		
		for(int rotate =1;rotate<=k;rotate++) {
			int tempLast=nums[nums.length-1];//last value store
			for(int i=nums.length-1;i>=1;i--) {
				nums[i]=nums[i-1];
			}
			nums[0]=tempLast;
		}
		
		//Printing Nums Array
		for(int element : nums) {
			System.out.print(element+" ");
		}
	}
}
