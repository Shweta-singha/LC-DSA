class Solution {
    public boolean checkInclusion(String s1, String s2) {
       
    int len1 = s1.length();
    int len2 = s2.length();
    
    if (len1 > len2) return false;
    
    int[] s1Counts = new int[26];
    int[] s2Counts = new int[26];
    
    // 1. Populate counts for s1 and the first window of s2
    for (int i = 0; i < len1; i++) {
        s1Counts[s1.charAt(i) - 'a']++;
        s2Counts[s2.charAt(i) - 'a']++;
    }
    
    // 2. Slide the window across s2
    for (int i = len1; i < len2; i++) {
        if (matches(s1Counts, s2Counts)) return true;
        
        // Add the new character entering the window
        s2Counts[s2.charAt(i) - 'a']++;
        // Remove the old character leaving the window
        s2Counts[s2.charAt(i - len1) - 'a']--;
    }
    
    // 3. Check the very last window position
    return matches(s1Counts, s2Counts);
}

// Helper method to compare the two frequency arrays
private boolean matches(int[] s1Counts, int[] s2Counts) {
    for (int i = 0; i < 26; i++) {
        if (s1Counts[i] != s2Counts[i]) return false;
    }
    return true;
}
}