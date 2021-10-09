package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class WordSearch {

    public boolean exist(char[][] board, String word) {
        // Special case
        if (board == null || board.length == 0 || word == null || word.isEmpty()) {
            return true;
        }
        // Dimensions of the board
        int rows = board.length;
        int columns = board[0].length;
        // Array to mark the visited cells
        boolean[][] visited = new boolean[rows][columns];
        // Loop through every cell
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // If the current character in board is equal to
                // the first character of the board, then only
                // we will start the DFS
                if (board[i][j] == word.charAt(0) && dfs(board, i, j, word, 0, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int i, int j, String word, int index, boolean[][] visited) {
        // If all the characters in the word are matched
        if (index == word.length() - 1) {
            return true;
        }
        // Mark the current cell are visited
        visited[i][j] = true;
        // Check for all the neighbors of the current cell
        if (i > 0 && !visited[i - 1][j] && board[i - 1][j] == word.charAt(index + 1) && dfs(board, i - 1, j, word, index + 1, visited)) {
            return true;
        }
        if (i < board.length - 1 && !visited[i + 1][j] && board[i + 1][j] == word.charAt(index + 1) && dfs(board, i + 1, j, word, index + 1, visited)) {
            return true;
        }
        if (j > 0 && !visited[i][j - 1] && board[i][j - 1] == word.charAt(index + 1) && dfs(board, i, j - 1, word, index + 1, visited)) {
            return true;
        }
        if (j < board[0].length - 1 && !visited[i][j + 1] && board[i][j + 1] == word.charAt(index + 1) && dfs(board, i, j + 1, word, index + 1, visited)) {
            return true;
        }
        visited[i][j] = false;
        return false;
    }
}
