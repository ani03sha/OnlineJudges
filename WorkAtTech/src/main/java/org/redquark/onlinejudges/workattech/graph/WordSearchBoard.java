package org.redquark.onlinejudges.workattech.graph;

public class WordSearchBoard {

    public boolean wordExists(char[][] board, String word) {
        if (board == null || board.length == 0 || word == null || word.isEmpty()) {
            return false;
        }
        // Dimensions of the matrix
        int m = board.length;
        int n = board[0].length;
        // Traverse through the board
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, i, j, word, 0, m, n)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int i, int j, String word, int index, int m, int n) {
        if (index == word.length()) {
            return true;
        }
        if (i < 0 || i >= m || j < 0 || j >= n || board[i][j] != word.charAt(index) || board[i][j] == '#') {
            return false;
        }
        // Get current character from the board
        char c = board[i][j];
        board[i][j] = '#';
        boolean w = dfs(board, i + 1, j, word, index + 1, m, n);
        boolean x = dfs(board, i - 1, j, word, index + 1, m, n);
        boolean y = dfs(board, i, j + 1, word, index + 1, m, n);
        boolean z = dfs(board, i, j - 1, word, index + 1, m, n);
        board[i][j] = c;
        return w || x || y || z;
    }
}
