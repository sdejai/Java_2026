package Lec26;

public class BestTimeBuySell {
	public static void main(String[] args) {
		int prices[] = { 7, 1, 5, 3, 6, 4 };
		int maxProfit=0;
		int profit=0;// -6 -2 -4 -1 -3 
		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				profit=prices[j]-prices[i];
				if(profit>maxProfit) {
					maxProfit=profit;
				}
			}
		}
		System.out.println(maxProfit);
		
	}
}
