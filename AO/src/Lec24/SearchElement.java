package Lec24;

public class SearchElement {
	public static void main(String[] args) {
		int nums[]= {2,4,5,12,234,76,12334};//2,
		int element=51;
		for(int index=0;index<nums.length;index++) {//index = 0,1,2,3,4
			if(nums[index]==element) {//2 12334, 4 12334, 5 12334, 12 12334
				System.out.println("True");
				return;
			}
		}
		System.out.println("False");
	}
}
