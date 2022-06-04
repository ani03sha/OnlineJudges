package org.redquark.onlinejudges.leetcode.backtracking;

/**
 * @author Anirudh Sharma
 */
public class NQueensII {

    // Count variable to keep track of distinct solutions
    private int count = 0;

    public int totalNQueens(int n) {
        // Special case
        if (n <= 0) {
            return 0;
        }
        // Boolean arrays to mark if there is a queen in the same
        // column, diagonal or anti-diagonal
        boolean[] columns = new boolean[n];
        boolean[] diagonals = new boolean[2 * n];
        boolean[] antiDiagonals = new boolean[2 * n];
        // Perform backtracking
        backtrack(n, 0, columns, diagonals, antiDiagonals);
        return count;
    }

    private void backtrack(int n, int row, boolean[] columns, boolean[] diagonals, boolean[] antiDiagonals) {
        // Base case - if all the rows are processed
        if (row == n) {
            count++;
        }
        // Traverse for all the columns
        for (int column = 0; column < n; column++) {
            // Current diagonal
            int diagonal = row - column + n;
            // Current anti diagonal
            int antiDiagonal = row + column;
            // If we already have queen in any of the places, we will skip
            if (columns[column] || diagonals[diagonal] || antiDiagonals[antiDiagonal]) {
                continue;
            }
            // Perform backtracking steps
            columns[column] = true;
            diagonals[diagonal] = true;
            antiDiagonals[antiDiagonal] = true;
            backtrack(n, row + 1, columns, diagonals, antiDiagonals);
            columns[column] = false;
            diagonals[diagonal] = false;
            antiDiagonals[antiDiagonal] = false;
        }
    }
}
