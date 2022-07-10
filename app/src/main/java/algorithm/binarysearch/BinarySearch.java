package algorithm.array;

public class BinarySearch {
    /**
     * 핵심은 1. floor -> 무조건 1개일때까지 간다
     * 2. 없을 수도 있어 -> left <= right
     * 3. 무조건 있어 -> left < right
     * 4. 새로운 binary search region 안에는 무조건 T가 있다.
     * 4-1. A[m] > T -> right = m : m보다 큰 모든 오른쪽을 싹 지운다 A[m] <= T -> left = m + 1 -> return R - 1
     * 4-2. A[m] >= T -> right = m : m을 포함하고 그 초과인 것들을 싹 날린다.
     * 
     * 즉 핵심은 탈출조건 left < right일때는 그냥 1개일때 빠져나온다. 다만 A[m] > T -> right = m, A[m] <= T -> left = m + 1은 T보다 살짝 큰 애를 찾는 것이기 때문에
     * 다시 말하자면, binary region을 항상 어떻게 잡느냐 -> 그리고 무조건 찾는 대상에 대해서는 leftmost로 가게 되어 있다.
     * 왜 항상 leftmost냐면 찾는 대상을 포함하는 region의 오른쪽을 잘라내니까!!!
     * 
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}
