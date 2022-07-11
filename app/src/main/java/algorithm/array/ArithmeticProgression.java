package algorithm.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArithmeticProgression {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != diff) return false;
        }
        
        return true;
    }
}
