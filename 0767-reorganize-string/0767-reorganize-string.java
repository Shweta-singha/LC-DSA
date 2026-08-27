import java.util.PriorityQueue;

class Solution {
    public String reorganizeString(String s) {
        // 1. Count character frequencies
        int[] charCounts = new int[26];
        for (char c : s.toCharArray()) {
            charCounts[c - 'a']++;
        }

        // 2. Set up the Max Heap, ordered by character frequency
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> charCounts[b - 'a'] - charCounts[a - 'a']);
        
        for (int i = 0; i < 26; i++) {
            if (charCounts[i] > 0) {
                // Check our invariant: if any character is too frequent, it's impossible
                if (charCounts[i] > (s.length() + 1) / 2) {
                    return ""; 
                }
                maxHeap.offer((char) (i + 'a'));
            }
        }

        // 3. Build the rearranged string by pulling TWO characters at a time
        StringBuilder result = new StringBuilder();

        while (maxHeap.size() >= 2) {
            // Get the top two most frequent available characters
            char char1 = maxHeap.poll();
            char char2 = maxHeap.poll();
            
            // Append them to the result
            result.append(char1);
            result.append(char2);
            
            // Decrease their counts
            charCounts[char1 - 'a']--;
            charCounts[char2 - 'a']--; 

            // Put them back into the heap if they still have counts left
            if (charCounts[char1 - 'a'] > 0) {
                maxHeap.offer(char1);
            }
            if (charCounts[char2 - 'a'] > 0) {
                maxHeap.offer(char2);
            }
        }

        // 4. Handle the last remaining character, if there is one
        if (!maxHeap.isEmpty()) {
            result.append(maxHeap.poll());
        }

        return result.toString();
    }
}