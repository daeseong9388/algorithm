package algorithm.array;

class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i = m-1; int j = n-1;
        int wIdx = m + n - 1;
        
        while (wIdx >= 0 && i >= 0 && j >= 0) {
            if (nums1[i] < nums2[j]) {
                nums1[wIdx] = nums2[j];
                j--;
            } else {
                nums1[wIdx] = nums1[i];
                i--;
            }
            wIdx--;
        }
        
        for (;j>=0;j--) nums1[j] = nums2[j];
        
    }
}