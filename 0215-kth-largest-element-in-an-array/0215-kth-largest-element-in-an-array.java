import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        // By default, PriorityQueue in Java acts as a Min-Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        // Standard for loop using an index 'i'
        for (int i = 0; i < nums.length; i++) {
            // Push the new number (accessed via index) into the club
            minHeap.add(nums[i]);
            
            // If the club is overcrowded, kick out the smallest element (the root)
            if (minHeap.size() > k) {
                minHeap.poll(); 
            }
        }
        
        // Peek at the root to get the kth largest element
        return minHeap.peek();
    }
}