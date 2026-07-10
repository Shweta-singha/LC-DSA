class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        Map<Integer, Integer>map = new HashMap<>();

        for(int i=0; i<nums.length;i++)
        {
            int no = target - nums[i];
            if(map.containsKey(no))
            {
                int index1 = map.get(no);
                int index2 = i;

                int[] res = {index1, index2};
                return res;

            }

            map.put(nums[i],i);

        }

        return new int[]{};
        
    }
}