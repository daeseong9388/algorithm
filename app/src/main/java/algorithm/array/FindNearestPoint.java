package algorithm.array;

public class FindNearestPoint {
    public int nearestValidPoint(int x, int y, int[][] points) {

        int ans = -1, idx = 0;
        int minDist = Integer.MAX_VALUE;
        for (int[] point : points) {
            int px = point[0], py = point[1];
            if (x == px || y == py) {
                int dist;
                if ((dist = Math.abs(x - px) + Math.abs(y - py)) < minDist) {
                    minDist = dist;
                    ans = idx;
                }
            }
            idx++;
        }

        return ans;
    }
}
