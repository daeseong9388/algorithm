package algorithm.binarysearch;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if (target < nums[0]) return 0;
        if (target > nums[nums.length - 1]) return nums.length;
        
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) right = mid;
            else left = mid + 1;
        }
        
        return nums[right - 1] == target ? right - 1 : right;
    }
    
}
