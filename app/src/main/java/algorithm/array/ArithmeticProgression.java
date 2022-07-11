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

    public boolean canMakeArithmeticProgressionHash(int[] arr) {
        Set<Integer> set = new HashSet<>();

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int num : arr) {
            set.add(num);
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        if ( (max - min) % (arr.length - 1) != 0) return false;
        int diff = (max - min) / (arr.length - 1);
        
        for (int num : arr) {
            if (num == max) continue;
            if (!set.contains(num + diff)) return false; 
        }
        
        return true;
    }
}
