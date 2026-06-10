class Solution {

    public int sumOfUnique(int[] nums) {

        int[] freq = new int[101];

        // Count frequency
        for(int num : nums)
        {
            freq[num]++;
        }

        int sum = 0;

        // Sum unique elements
        for(int num : nums)
        {
            if(freq[num] == 1)
            {
                sum += num;
            }
        }

        return sum;
    }
}