class Solution {
    public int lastStoneWeight(int[] stones) 
    {
        
    // Max Heap
        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        // Add all stones to heap
        for (int i = 0; i < stones.length; i++) {
            maxHeap.offer(stones[i]);
        }

        // Keep smashing while at least 2 stones exist
        while (maxHeap.size() > 1) {

            int y = maxHeap.poll(); // largest stone
            int x = maxHeap.poll(); // second largest stone

            // If weights are different
            if (y != x) {
                maxHeap.offer(y - x);
            }
        }

        // If no stone left
        if (maxHeap.isEmpty()) {
            return 0;
        }

        // Last remaining stone
        return maxHeap.peek();
    }
}