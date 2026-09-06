class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        
        prefixSum = nums[0]
        answerSum = [prefixSum]

        for i in range(1,len(nums)):
            prefixSum += nums[i]
            answerSum.append(prefixSum)
        
        return answerSum