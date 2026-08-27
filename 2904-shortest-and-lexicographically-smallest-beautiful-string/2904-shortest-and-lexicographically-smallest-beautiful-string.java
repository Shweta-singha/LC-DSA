import java.util.*;

class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        // Step 1: Store positions of all '1's
        List<Integer> onesIndices = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                onesIndices.add(i);
            }
        }

        // Step 2: Not enough 1s to make a beautiful substring
        if (onesIndices.size() < k) {
            return "";
        }

        // Step 3: Store the best answer
        String bestStr = "";

        // Step 4: Take k 1s at a time
        for (int i = 0; i <= onesIndices.size() - k; i++) {

            // First 1 in the current window
            int start = onesIndices.get(i);

            // kth 1 in the current window
            int end = onesIndices.get(i + k - 1);

            // Step 5: Extract substring
            String currentStr = s.substring(start, end + 1);

            // Step 6: Compare with best answer
            if (bestStr.isEmpty()) {
                bestStr = currentStr;
            }
            else if (currentStr.length() < bestStr.length()) {
                bestStr = currentStr;
            }
            else if (currentStr.length() == bestStr.length()
                    && currentStr.compareTo(bestStr) < 0) {
                bestStr = currentStr;
            }
        }

        // Step 7: Return answer
        return bestStr;
    }
}