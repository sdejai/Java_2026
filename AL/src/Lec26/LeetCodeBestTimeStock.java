package Lec26;

public class LeetCodeBestTimeStock {
	public static int bestTimeBuySell(int nums[]) {
		int maxprofit=0;
		int buy=nums[0];
		for(int i=0;i<nums.length;i++) {
			int sell=nums[i];
			if(buy>sell) {
				buy=sell;
			}
			int profit=sell-buy;	
			if(profit>maxprofit) {
				maxprofit=profit;
			}
		}
		
		return maxprofit;
	}
	public static void main(String[] args) {
		int nums[]= {7,1,5,3,6,4};
		System.out.println(bestTimeBuySell(nums));
	}
}
