package algorithm.string;

import java.util.HashMap;
import java.util.Map;

public class OneSwapEqual {
    public boolean areAlmostEqual(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) return false;
            map.put(c, map.get(c) - 1); 
        }
        return true;
    }
}
