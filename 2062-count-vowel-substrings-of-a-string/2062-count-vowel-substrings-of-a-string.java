import java.util.*;

class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            Set<Character> vowels = new HashSet<>();

            for (int j = i; j < word.length(); j++) {

                char ch = word.charAt(j);

                
                if (!isVowel(ch)) {
                    break;
                }

    
                vowels.add(ch);

                if (vowels.size() == 5) {
                    count++;
                }
            }
        }

        return count;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u';
    }
}