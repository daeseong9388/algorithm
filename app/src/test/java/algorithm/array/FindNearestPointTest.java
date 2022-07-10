package algorithm.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FindNearestPointTest {
    private FindNearestPoint solution = new FindNearestPoint();
    @Test
    void testNearestValidPoint() {
        int[][] points;
        int ans;

        points = new int[][]{{1,2},{3,1},{2,4},{2,3},{4,4}};
        ans = solution.nearestValidPoint(3, 4, points);
        assertEquals(2, ans);
    }
}
