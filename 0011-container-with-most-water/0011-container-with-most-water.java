class Solution {
    public int maxArea(int[] height) 
    {
        int maxArea = 0;
    int left = 0;
    int right = height.length - 1;
    
    // Loop until the pointers meet
    while (left < right) {
        // Calculate current width and height
        int width = right - left;
        int currentHeight = Math.min(height[left], height[right]);
        int area = width * currentHeight;
        
        // Update maxArea if the current area is bigger
        maxArea = Math.max(maxArea, area);
        
        // Move the pointer of the shorter line
        if (height[left] < height[right]) {
            left++; // Move left pointer rightward
        } else {
            right--; // Move right pointer leftward
        }
    }
    
    return maxArea;
}
}