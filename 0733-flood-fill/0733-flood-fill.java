class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int oldColor = image[sr][sc];

        // Agar color same hai to kuch karne ki zarurat nahi
        if (oldColor == color) {
            return image;
        }

        dfs(image, sr, sc, oldColor, color);

        return image;
    }

    private void dfs(int[][] image, int row, int col,
                     int oldColor, int newColor) {

        // Boundary check
        if (row < 0 || row >= image.length ||
            col < 0 || col >= image[0].length) {
            return;
        }

        // Agar original color nahi hai to stop
        if (image[row][col] != oldColor) {
            return;
        }

        // Color change karo
        image[row][col] = newColor;

        // 4 directions
        dfs(image, row - 1, col, oldColor, newColor); // Up
        dfs(image, row + 1, col, oldColor, newColor); // Down
        dfs(image, row, col - 1, oldColor, newColor); // Left
        dfs(image, row, col + 1, oldColor, newColor); // Right
    }
}