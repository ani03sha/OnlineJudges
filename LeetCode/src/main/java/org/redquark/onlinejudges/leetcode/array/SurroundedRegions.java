package org.redquark.onlinejudges.leetcode.array;

public class SurroundedRegions {

    public char[][] solve(char[][] board) {
        // Special case
        if (board == null || board.length == 0) {
            return board;
        }
        // Dimensions of the board
        int m = board.length;
        int n = board[0].length;
        // Array to store visited cells
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') {
                dfs(board, visited, i, 0);
            }
        }
        for (int i = 0; i < m; i++) {
            if (board[i][n - 1] == 'O') {
                dfs(board, visited, i, n - 1);
            }
        }
        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O') {
                dfs(board, visited, 0, j);
            }
        }
        for (int j = 0; j < n; j++) {
            if (board[m - 1][j] == 'O') {
                dfs(board, visited, m - 1, j);
            }
        }
        // Capture the regions
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
        return board;
    }

    private void dfs(char[][] board, boolean[][] visited, int i, int j) {
        // Check if indices are out of bounds
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] || board[i][j] == 'X') {
            return;
        }
        // Mark this cell as visited
        visited[i][j] = true;
        // Recurse in all four directions
        dfs(board, visited, i + 1, j);
        dfs(board, visited, i - 1, j);
        dfs(board, visited, i, j + 1);
        dfs(board, visited, i, j - 1);
    }
}
