package algorithm.array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TwoSumTest {
    private TwoSum solution;
    @BeforeEach
    void beforeEach() {
        solution = new TwoSum();
    }

    int[] makeValidArrayAndReturnAns(int[] nums, int length, int target) {
        Set<Integer> set = new HashSet<>();
        int bound = 100;
        int a = new Random().nextInt(bound);

        set.add(a);
        set.add(target - a);


        int left = new Random().nextInt(length/2);
        int right = new Random().nextInt(length/2) + length/2; 
        int[] ans = new int[]{left, right};

        nums[left] = a;
        nums[right] = target - a;
    
        int count = 0;
        while (count < length) {
            int num = new Random().nextInt(bound);
            if (set.contains(num)) continue;
            if (count == left || count == right) {
                count++;
                continue;
            }

            nums[count] = num;
            set.add(target - num);
            count++;
        }

        return ans;
    }

    @Test
    void testTwoSum() {
        int[] nums; int[] ans;
        int target;

        nums = new int[]{2,7,11,15};
        target = 9;
        ans = solution.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 1}, ans);

        nums = new int[]{3,2,4};
        target = 6;
        ans = solution.twoSum(nums, target);
        assertArrayEquals(new int[]{1, 2}, ans);


        int length = 100;
        nums = new int[length];
        target = 6;

        int[] expected = makeValidArrayAndReturnAns(nums, length, target);

        ans = solution.twoSum(nums, target);
        assertArrayEquals(expected, ans);

    }
}
