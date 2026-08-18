class Solution {
    public boolean isValidSudoku(char[][] board) {

        // 9 sets for rows
        HashSet<Character>[] rows = new HashSet[9];

        // 9 sets for columns
        HashSet<Character>[] cols = new HashSet[9];

        // 9 sets for 3x3 boxes
        HashSet<Character>[] boxes = new HashSet[9];

        // Initialize all sets
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        // Visit every cell
        for (int row = 0; row < 9; row++) {

            for (int col = 0; col < 9; col++) {

                char num = board[row][col];

                // Ignore empty cells
                if (num == '.') {
                    continue;
                }

                // Find the 3x3 box
                int box = (row / 3) * 3 + (col / 3);

                // Check duplicate in row, column, or box
                if (rows[row].contains(num) ||
                    cols[col].contains(num) ||
                    boxes[box].contains(num)) {

                    return false;
                }

                // Add number to row, column, and box
                rows[row].add(num);
                cols[col].add(num);
                boxes[box].add(num);
            }
        }

        return true;
    }
}