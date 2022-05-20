package training.interview.arrays;

public class MaxProfits {

    public static int maxProfit(int[] prices) {

        int profit = 0;

        int length = prices.length;
        for (int i = 1; i < length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

}
