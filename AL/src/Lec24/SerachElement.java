package Lec24;

public class SerachElement {
	public static void main(String[] args) {
		int nums[]= {12,35,7,2,98};
		int searchElement=44;
		for(int index=0;index<nums.length;index++) {
			if(nums[index]==searchElement) { // 12==44
				System.out.println("True");
				return;
			}
		}
		System.out.println("False");
	}
}
