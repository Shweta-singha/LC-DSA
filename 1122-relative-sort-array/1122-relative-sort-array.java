class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int[] freq = new int[1001];

        // Count frequency of arr1 elements
        for (int i = 0; i < arr1.length; i++) {
            freq[arr1[i]]++;
        }

        int index = 0;

        // Place elements according to arr2 order
        for (int i = 0; i < arr2.length; i++) {

            int num = arr2[i];

            while (freq[num] > 0) {
                arr1[index] = num;
                index++;
                freq[num]--;
            }
        }

        // Place remaining elements in ascending order
        for (int i = 0; i <= 1000; i++) {

            while (freq[i] > 0) {
                arr1[index] = i;
                index++;
                freq[i]--;
            }
        }

        return arr1;
    }
}