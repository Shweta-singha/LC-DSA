class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        int[] ans = new int[col];

        for (int i = 0; i < col; i++) {
            int maxWidth = 0;

            for (int j = 0; j < row; j++) {
                int len = String.valueOf(grid[j][i]).length();
                maxWidth = Math.max(maxWidth, len);
            }

            ans[i] = maxWidth;
        }

        return ans;
    }
}