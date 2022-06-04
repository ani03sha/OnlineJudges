package org.redquark.onlinejudges.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class NQueens {

    public List<List<String>> solveNQueens(int n) {
        // List to store the final positions
        List<List<String>> positions = new ArrayList<>();
        // Special case
        if (n <= 0) {
            return positions;
        }
        // A character array which represents the positions
        char[][] board = new char[n][n];
        // Populate this array with default values
        Arrays.stream(board).forEach(b -> Arrays.fill(b, '.'));
        // Perform backtracking
        backtrack(board, n, 0, positions);
        return positions;
    }

    private void backtrack(char[][] board, int n, int row, List<List<String>> positions) {
        // Base case
        if (row == n) {
            positions.add(create(board));
            return;
        }
        // Loop through every column of the current row and perform backtracking operation
        for (int column = 0; column < n; column++) {
            if (isValid(board, row, column)) {
                board[row][column] = 'Q';
                backtrack(board, n, row + 1, positions);
                board[row][column] = '.';
            }
        }
    }

    private boolean isValid(char[][] board, int row, int column) {
        // Check all columns for the current row
        for (int i = 0; i < row; i++) {
            if (board[i][column] == 'Q') {
                return false;
            }
        }
        // Check all diagonal positions
        for (int i = row - 1, j = column + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // Check all reverse diagonal positions
        for (int i = row - 1, j = column - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    private List<String> create(char[][] board) {
        List<String> path = new ArrayList<>();
        for (char[] chars : board) {
            path.add(String.valueOf(chars));
        }
        return path;
    }
}
