class Solution {
    public int countCharacters(String[] words, String chars) {

        // Frequency of chars
        int[] charsFreq = new int[26];

        for (int i = 0; i < chars.length(); i++) {
            charsFreq[chars.charAt(i) - 'a']++;
        }

        int answer = 0;

        // Check every word
        for (String word : words) {

            // Frequency of current word
            int[] wordFreq = new int[26];

            for (int i = 0; i < word.length(); i++) {
                wordFreq[word.charAt(i) - 'a']++;
            }

            boolean canForm = true;

            // Compare frequencies
            for (int i = 0; i < 26; i++) {

                if (wordFreq[i] > charsFreq[i]) {
                    canForm = false;
                    break;
                }
            }

            if (canForm) {
                answer += word.length();
            }
        }

        return answer;
    }
}