class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {

            int minVal = matrix[i][0];
            int colIndex = 0;

            // Find minimum in current row
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                    colIndex = j;
                }
            }

            // Find maximum in that column
            boolean isLucky = true;

            for (int r = 0; r < rows; r++) {
                if (matrix[r][colIndex] > minVal) {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky) {
                ans.add(minVal);
            }
        }

        return ans;
    }
}