package algorithm.array;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaximumSubarrayTest {
    private MaximumSubarray solution;
    @BeforeEach
    void beforeEach() {
        solution = new MaximumSubarray();
    }

    @Test
    void testMaxSubArray() {
        int[] input; int ans;

        input = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        ans = solution.maxSubArray(input);
        assertEquals(6, ans);

        input = new int[]{1};
        ans = solution.maxSubArray(input);
        assertEquals(1, ans);
    }
}
