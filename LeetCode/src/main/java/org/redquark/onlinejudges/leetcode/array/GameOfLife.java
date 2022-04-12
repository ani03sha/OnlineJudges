package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class GameOfLife {

    public int[][] gameOfLife(int[][] board) {
        // Special case
        if (board == null || board.length == 0) {
            return board;
        }
        // Dimensions of the board
        int m = board.length;
        int n = board[0].length;
        // Eight directions
        int[][] directions = new int[][]{
                {-1, -1}, // Top left
                {-1, 0},  // Top
                {-1, 1},  // Top right
                {0, -1},  // Left
                {0, 1},   // Right
                {1, -1},  // Bottom left
                {1, 0},   // Bottom
                {1, 1}};  // Bottom-right
        // Loop through every element in the board to find the alive neighbors
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Get the alive neighbors of this cell
                int aliveNeighbors = getAliveNeighbors(board, i, j, m, n, directions);
                // Implementing rules
                // Dead cell with 3 alive neighbors will become alive
                if (board[i][j] == 0 && aliveNeighbors == 3) {
                    board[i][j] = 2;
                }
                // Live cell with 2 or 3 will survive this generation
                else if (board[i][j] == 1 && (aliveNeighbors == 2 || aliveNeighbors == 3)) {
                    board[i][j] = 3;
                }
            }
        }
        // Update the elements in the board
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Right shift to move to the next state
                board[i][j] >>= 1;
            }
        }
        return board;
    }

    private int getAliveNeighbors(int[][] board, int i, int j, int m, int n, int[][] directions) {
        int aliveNeighborsCount = 0;
        for (int[] direction : directions) {
            int x = i + direction[0];
            int y = j + direction[1];
            if (!isOutOfBounds(m, n, x, y)) {
                aliveNeighborsCount += board[x][y] & 1;
            }
        }
        return aliveNeighborsCount;
    }

    private boolean isOutOfBounds(int m, int n, int x, int y) {
        return x < 0 || x >= m || y < 0 || y >= n;
    }
}
