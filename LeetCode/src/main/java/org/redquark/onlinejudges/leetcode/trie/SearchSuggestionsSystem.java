package org.redquark.onlinejudges.leetcode.trie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class SearchSuggestionsSystem {

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        // List to store the suggestions
        List<List<String>> suggestions = new ArrayList<>();
        if (products == null || products.length == 0) {
            return suggestions;
        }
        // Sort the words lexicographically
        Arrays.sort(products);
        TrieNode root = new TrieNode();
        // Build trie by inserting every word
        for (String product : products) {
            insert(product, root); // insert a product into Trie.
        }
        return search(searchWord, root, suggestions);
    }

    private void insert(String word, TrieNode root) {
        // Reference of the root node
        TrieNode temp = root;
        // Insert current word in the trie
        for (char c : word.toCharArray()) {
            if (temp.children[c - 'a'] == null) {
                temp.children[c - 'a'] = new TrieNode();
            }
            temp = temp.children[c - 'a'];
            // Add word as the suggestion and there are less than
            // three suggestions
            if (temp.suggestions.size() < 3) {
                temp.suggestions.add(word);
            }
        }
    }

    private List<List<String>> search(String word, TrieNode root, List<List<String>> suggestions) {
        for (char c : word.toCharArray()) {
            if (root != null) {
                root = root.children[c - 'a'];
            }
            suggestions.add(root == null ? List.of() : root.suggestions);
        }
        return suggestions;
    }

    static class TrieNode {
        // Children nodes of the current node
        TrieNode[] children = new TrieNode[26];
        // Queue to store suggestions
        List<String> suggestions = new LinkedList<>();
    }
}
