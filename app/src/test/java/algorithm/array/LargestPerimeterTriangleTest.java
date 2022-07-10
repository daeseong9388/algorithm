package algorithm.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LargestPerimeterTriangleTest {
    private LargestPerimeterTriangle solution;
    
    @BeforeEach
    void beforeEach() {
        solution = new LargestPerimeterTriangle();
    }

    @Test
    void testLargestPerimeter() {
        int[] nums; int ans;

        nums = new int[]{2,7,11,15};
        ans = solution.largestPerimeter(nums);
        assertEquals(33, ans);


        nums = new int[]{22,17,16,15};
        ans = solution.largestPerimeter(nums);
        assertEquals(55, ans);
    }
}
