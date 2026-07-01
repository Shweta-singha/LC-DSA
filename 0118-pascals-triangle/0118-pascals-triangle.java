import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            // First element is always 1
            row.add(1);

            // Middle elements
            for (int j = 1; j < i; j++) {

                List<Integer> prevRow = result.get(i - 1);

                int value = prevRow.get(j - 1) + prevRow.get(j);

                row.add(value);
            }

            // Last element is also 1 (except first row)
            if (i > 0) {
                row.add(1);
            }

            result.add(row);
        }

        return result;
    }
}