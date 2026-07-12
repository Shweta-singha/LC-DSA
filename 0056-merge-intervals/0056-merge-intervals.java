import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        // Step 1: Sort by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        // Add first interval
        result.add(intervals[0]);

        // Step 2: Process remaining intervals
        for (int i = 1; i < intervals.length; i++) {

            int[] last = result.get(result.size() - 1);

            // Overlapping
            if (intervals[i][0] <= last[1]) {

                // Extend end if needed
                last[1] = Math.max(last[1], intervals[i][1]);
            }
            // Non-overlapping
            else {
                result.add(intervals[i]);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}