class Solution:
    def buildArray(self, nums: List[int]) -> List[int]:


        answer = [] 
        for i in range(0,len(nums)):
            answer.append(nums[nums[i]])
        

        return answer
        