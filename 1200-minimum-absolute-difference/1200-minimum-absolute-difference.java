class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) 
    {
        Arrays.sort(arr);
        List<List<Integer>>answer = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE; 

        for(int i = 1; i<arr.length; i++)
        {
            int diff = arr[i] - arr[i-1];

            if(diff<minDiff)
            {
                minDiff = diff; 
                answer.clear(); 
                answer.add(Arrays.asList(arr[i-1],arr[i]));
            }
            else if (diff == minDiff) 
            {
                answer.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }

        return answer;       
    }
}