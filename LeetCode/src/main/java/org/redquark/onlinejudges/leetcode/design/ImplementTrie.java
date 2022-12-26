package org.redquark.onlinejudges.leetcode.design;

import org.redquark.onlinejudges.leetcode.common.TrieNode;

public class ImplementTrie {

    static class Trie {

        // Root of the Trie
        private final TrieNode root;

        public Trie() {
            // The root node of the Trie doesn't contain any
            // data so, we are initializing it with a default
            // value
            this.root = new TrieNode('\u0000');
        }

        public void insert(String word) {
            // Check if the word is already present
            if (search(word)) {
                return;
            }
            // Pointer to traverse through the Trie
            TrieNode temp = root;
            // Loop through the word
            for (char c : word.toCharArray()) {
                // If the node corresponding to the current character
                // is not present, we will create it
                if (temp.children[c - 'a'] == null) {
                    TrieNode node = new TrieNode(c);
                    temp.children[c - 'a'] = node;
                }
                // Move the pointer to its child
                temp = temp.children[c - 'a'];
            }
            // At the end of the word, we should mark the node
            // as the complete word by making isLeaf true for
            // that node
            temp.isLeaf = true;
        }

        public boolean search(String word) {
            // Pointer to traverse through the Trie
            TrieNode temp = root;
            // Loop through the word
            for (char c : word.toCharArray()) {
                // If the node corresponding to the current character
                // in a subtree is not present, we will return false
                if (temp.children[c - 'a'] == null) {
                    return false;
                }
                // Move the pointer downward in the current subtree
                temp = temp.children[c - 'a'];
            }
            // If the word is complete, then only the search is truly
            // completed, otherwise not.
            return temp.isLeaf;
        }

        public boolean startsWith(String prefix) {
            // Check if the word is already present
            if (search(prefix)) {
                return true;
            }
            // Pointer to traverse through the Trie
            TrieNode temp = root;
            // Loop through the word
            for (char c : prefix.toCharArray()) {
                // If the current character is not present, we
                // can't have prefix
                if (temp.children[c - 'a'] == null) {
                    return false;
                }
                // Move pointer further in the current tree
                temp = temp.children[c - 'a'];
            }
            // Since for prefix, we don't need to see if we have
            // reached to the left node or not, we return true
            // directly from here
            return true;
        }
    }
}
