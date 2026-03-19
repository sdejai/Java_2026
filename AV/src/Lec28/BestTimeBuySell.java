package Lec28;

public class BestTimeBuySell {
	public static void main(String[] args) {
		int nums[]= {7,1,5,3,6,4};
		int maxprofit=0;
		for(int buy=0;buy<nums.length;buy++) {
			for(int sell=buy+1;sell<nums.length;sell++) {
				int profit=nums[sell]-nums[buy];
				if(profit>maxprofit) {
					maxprofit=profit;
				}
			}
		}
//		return maxprofit;
		System.out.println(maxprofit);
	}
}
