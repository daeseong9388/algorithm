package algorithm.array;

public class MaximumSubarray {
    /**
     * https://en.wikipedia.org/wiki/Maximum_subarray_problem#Kadane's_algorithm
     * 모든 것이 0 포함 양수라면 전체, 모든 것이 음수라면 최대값
     * brute force -> divide and conquer and dynamic programming -> reduction to shortest path
     * 응용, sequence analysis and computer vision
     * 1. 빈 배열을 허용한다면 -> current_sum = max(0, current_sum + x) -> invariant 옛날의 current sum j - 1까지 best를 통해 j 까지
     * 2. 빈 배열을 허용하지 않는다면? max(x, current_sum + x)
     * current_sum -> j - 1까지의 sum이 음수라면 x,  아니면 x를 더해
     * 
     * 무엇인가의 최대 최소를 물어본다 -> dp로 일단 접근 
     * 문제의 핵심은 언제 음수를 가져가고 혹은 버릴지
     * 
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int best_sum = 0;
        int best_start = 0, best_end = 0;
        
        int current_sum = 0;
        int current_start = 0, current_end = 0;
        for (int i = 0; i < nums.length; i++) {
            if (current_sum <= 0) {
                current_start = (current_end = i);
                current_sum = nums[i];
            } else {
                current_sum += nums[i];
            }

            if (current_sum > best_sum) {
                best_sum = current_sum;
                best_start = current_start;
                best_end = i;
            }
        }

        return best_sum;
    }
}
