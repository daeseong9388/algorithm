package algorithm.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStockTest {
    private BestTimeToBuyAndSellStock solution;
    
    @BeforeEach
    void beforeEach() {
        solution = new BestTimeToBuyAndSellStock();
    }

    @Test
    void testMaxProfit() {
        int[] prices; int ans;

        prices = new int[]{2,7,11,15};
        ans = solution.maxProfit(prices);
        assertEquals(13, ans);


        prices = new int[]{22,17,16,15};
        ans = solution.maxProfit(prices);
        assertEquals(0, ans);

    }
}
