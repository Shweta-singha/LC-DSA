class Solution {

    class TrieNode {
        TrieNode[] child = new TrieNode[2];
    }

    public int findMaximumXOR(int[] nums) {

        TrieNode root = new TrieNode();

        // Insert all numbers into Trie
        for (int num : nums) {

            TrieNode curr = root;

            for (int i = 30; i >= 0; i--) {

                int bit = (num >> i) & 1;

                if (curr.child[bit] == null) {
                    curr.child[bit] = new TrieNode();
                }

                curr = curr.child[bit];
            }
        }

        int maxXor = 0;

        // Find maximum XOR for every number
        for (int num : nums) {

            TrieNode curr = root;
            int xor = 0;

            for (int i = 30; i >= 0; i--) {

                int bit = (num >> i) & 1;

                // We want the opposite bit
                int opposite = 1 - bit;

                if (curr.child[opposite] != null) {

                    xor = xor | (1 << i);
                    curr = curr.child[opposite];

                } else {

                    curr = curr.child[bit];
                }
            }

            maxXor = Math.max(maxXor, xor);
        }

        return maxXor;
    }
}