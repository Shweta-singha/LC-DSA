class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Quick check: You can't make a longer note out of a shorter magazine
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        int[] count = new int[26];

        // Count letters in magazine
        for (int i = 0; i < magazine.length(); i++) {
            count[magazine.charAt(i) - 'a']++;
        }

        // Check ransomNote letters
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);

            if (count[ch - 'a'] == 0) {
                return false; // Out of this letter!
            }
            count[ch - 'a']--;
        }

        return true;
    }
}