package algorithm.array;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = prices[0];
        for (int price : prices) {
            max = Math.max(max, price - min);
            min = Math.min(min, price);
        }

        return max;
    }
}
