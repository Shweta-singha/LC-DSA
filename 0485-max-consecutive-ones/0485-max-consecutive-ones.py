class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        
        maxim = 0
        count = 0 

        for i in range(len(nums)): 
            if nums[i] == 1:
                count += 1
                maxim = max(maxim, count)
            else: 
                count = 0
        return maxim