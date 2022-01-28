package org.redquark.onlinejudges.leetcode.design;

/**
 * @author Anirudh Sharma
 */
public class DesignAddAndSearchWordsDataStructure {

    static class WordDictionary {

        private final TrieNode root;

        public WordDictionary() {
            this.root = new TrieNode();
        }

        public void addWord(String word) {
            // Reference of the root node
            TrieNode temp = root;
            // Store each character of the word in the Trie as node
            for (char c : word.toCharArray()) {
                int index = c - 'a';
                // If the character is not present in the Trie
                if (temp.children[index] == null) {
                    // Create a new node
                    TrieNode node = new TrieNode();
                    temp.children[index] = node;
                    // Move the pointer to the newly created node
                    temp = node;
                }
                // If the character is present in the Trie
                else {
                    temp = temp.children[index];
                }
            }
            // If all the words are inserted mark the last node as leaf
            temp.isLeaf = true;
        }

        public boolean search(String word) {
            return dfs(root, word, 0);
        }

        private boolean dfs(TrieNode node, String word, int start) {
            // Check if we are already at the leaf node
            if (node.isLeaf && start == word.length()) {
                return true;
            }
            // If we are not at leaf node but all the characters are traversed
            if (start >= word.length()) {
                return false;
            }
            // Current character
            char c = word.charAt(start);
            // Check for period sign
            if (c == '.') {
                boolean result = false;
                for (int i = 0; i < 26; i++) {
                    if (node.children[i] != null) {
                        if (dfs(node.children[i], word, start + 1)) {
                            result = true;
                            break;
                        }
                    }
                }
                return result;
            } else {
                // Get the current index
                int index = c - 'a';
                return node.children[index] != null && dfs(node.children[index], word, start + 1);
            }
        }

        static class TrieNode {
            private final TrieNode[] children;
            private boolean isLeaf;

            TrieNode() {
                children = new TrieNode[26];
            }
        }
    }
}
