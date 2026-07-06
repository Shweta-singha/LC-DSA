class KthLargest 
{
    private PriorityQueue<Integer> minHeap;
    private int k;

    public KthLargest(int k, int[] nums) 
    {
        this.k = k;
        minHeap = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) 
        {
            minHeap.offer(nums[i]);
            if (minHeap.size() > k) 
            {
                minHeap.poll();
            }
        }
    }
    
    public int add(int val) 
    {

      // Optimization check:
        // If we already have k elements and the new value isn't even bigger 
        // than our current kth largest (the root), it has no chance of entering the top k.
        if (minHeap.size() == k && val <= minHeap.peek()) 
        {
            return minHeap.peek(); // Just return the current root immediately!
        }


      minHeap.offer(val);

        if (minHeap.size() > k) 
        {
            minHeap.poll();
        }

        return minHeap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */