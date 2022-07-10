package algorithm.array;

import java.util.Arrays;

public class LargestPerimeterTriangle {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int maxPerimeter = 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i - 2] + nums[i - 1] > nums[i]) {
                maxPerimeter = Math.max(maxPerimeter, nums[i - 2] + nums[i - 1] + nums[i]);
            }
        }
        
        return maxPerimeter;
    }
}
