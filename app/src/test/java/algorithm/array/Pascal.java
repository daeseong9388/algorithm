package algorithm.array;

import java.util.ArrayList;
import java.util.List;

public class Pascal {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();
            
            int j = 0;
            while (j < i) {
                if (j == 0 || j == i - 1) {
                    row.add(1);
                    j++;
                } else {
                    List<Integer> prevRow = result.get(i - 2);
                    for (int k = 0; k < prevRow.size() - 1; k++) {
                        row.add(prevRow.get(k) + prevRow.get(k + 1));
                        j++;
                    }
                }
            }
            result.add(row);
        }
        
        return result;
    }
}
