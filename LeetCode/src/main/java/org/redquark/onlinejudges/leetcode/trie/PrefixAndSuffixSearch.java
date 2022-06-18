package org.redquark.onlinejudges.leetcode.trie;

/**
 * @author Anirudh Sharma
 */
public class PrefixAndSuffixSearch {

    static class WordFilter {
        // Root of the trie
        private final TrieNode root;

        public WordFilter(String[] words) {
            // Create the root of the Trie
            root = new TrieNode();
            // Loop through every word in the dictionary
            for (int i = 0; i < words.length; i++) {
                // Generate a new word by prepending '{"
                String word = "{" + words[i];
                // Insert this word in the Trie
                insert(root, word, i);
                // Add words which will be formed by prepending
                // "word" calculated in above step with each
                // character at a time starting from right
                for (int j = 0; j < word.length(); j++) {
                    // Skip first '{'
                    insert(root, word.substring(j + 1) + word, i);
                }
            }
        }

        private void insert(TrieNode root, String word, int weight) {
            // Get the current node
            TrieNode current = root;
            // Insert the words in Trie character by character
            for (char c : word.toCharArray()) {
                // Index for this character
                int index = c - 'a';
                // Check if we have already created a node at
                // index "index"
                if (current.children[index] == null) {
                    current.children[index] = new TrieNode();
                }
                // Move to that child
                current = current.children[index];
                current.weight = weight;
            }
        }

        public int f(String prefix, String suffix) {
            // Current node we are at
            TrieNode current = root;
            // Search for the word with given prefix and
            // suffix in the Trie
            for (char c : (suffix + "{" + prefix).toCharArray()) {
                if (current.children[c - 'a'] == null) {
                    return -1;
                }
                // Move to that child
                current = current.children[c - 'a'];
            }
            return current.weight;
        }

        static class TrieNode {
            private final TrieNode[] children;
            private int weight;

            TrieNode() {
                this.weight = 0;
                // Size explanation - a-z have 26 characters and 27th
                // space is left for "{" which is next to 'z' in ASCII.
                this.children = new TrieNode[27];
            }
        }
    }
}
