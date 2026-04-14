package Lec7;

public class RemoveDublicate {
	public static int removeDublicate(int nums[]){
		int i=0;
		for(int j=1;j<nums.length;j++) {
			if(nums[i]!=nums[j]) {
				i++;
				nums[i]=nums[j];
			}
		}
		return i+1;
//		for(int k=0;k<=i;k++) {
//			System.out.print(nums[k]+" ");
//		}
	}
	public static void main(String[] args) {
		int nums[]= {0,0,1,1,1,2,2,3,3,4};
		removeDublicate(nums);
	}
}
