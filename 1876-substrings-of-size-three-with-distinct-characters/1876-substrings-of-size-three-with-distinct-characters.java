public class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        int n = s.length();
        
        // Loop up to n - 3
        for (int i = 0; i <= n - 3; i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i + 1);
            char c3 = s.charAt(i + 2);
            
            // Check if all three characters are distinct
            if (c1 != c2 && c2 != c3 && c1 != c3) {
                count++;
            }
        }
        
        return count;
    }
}