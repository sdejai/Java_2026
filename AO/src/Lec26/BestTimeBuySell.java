package Lec26;

public class BestTimeBuySell {
	public static void main(String[] args) {
		int prices[]= {7,1,5,3,6,409};
		int maxProfit=0;
		for(int buy=0;buy<prices.length;buy++) {
			for(int sell=buy+1;sell<prices.length;sell++) {
				int profit=prices[sell]-prices[buy];
				if(profit>maxProfit) {
					maxProfit=profit;
				}
			}
		}
		System.out.println(maxProfit);
	}
}
