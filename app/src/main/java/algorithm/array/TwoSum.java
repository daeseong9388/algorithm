package algorithm.array;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] tmp = new int[nums.length];
        System.arraycopy(nums, 0, tmp, 0, nums.length);
        Arrays.sort(tmp);
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = tmp[left] + tmp[right];
            if (target < sum) right--;
            else if (target > sum) left++;
            else break;
        }

        if (left == right) return new int[0];


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == tmp[left]) {
                left = i;
                break;
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == tmp[right]) {
                right = i;
                break;
            }
        }
        if (left > right) {
            int idx = left;
            left = right;
            right = idx;
        }
        return new int[]{left, right};
    }
}
