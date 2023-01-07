package org.redquark.onlinejudges.workattech.graph;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class WordLadder {

    public int shortestLadderLength(String beginWord, String endWord, String[] wordList) {
        // Special case
        if (wordList == null || wordList.length == 0 || beginWord.equals(endWord)) {
            return 0;
        }
        // Set to store the dictionary to get O(1) contains
        Set<String> words = new HashSet<>(Arrays.asList(wordList));
        // Check if endWord is not in the dictionary
        if (!words.contains(endWord)) {
            return 0;
        }
        // Queue to perform BFS
        Queue<String> nodes = new ArrayDeque<>();
        // Add beginWord to the queue
        nodes.offer(beginWord);
        // Length of the path
        int pathLength = 0;
        // Loop until the queue is not empty
        while (!nodes.isEmpty()) {
            pathLength++;
            // Get the size of the queue
            int size = nodes.size();
            for (int i = 0; i < size; i++) {
                // Get the word at the front of the queue
                char[] word = nodes.remove().toCharArray();
                // Loop through every character of the word
                for (int j = 0; j < word.length; j++) {
                    char originalCharacter = word[j];
                    // Try every character from a to z
                    for (char c = 'a'; c <= 'z'; c++) {
                        word[j] = c;
                        String tempWord = String.valueOf(word);
                        // Check if this word is equal to the endWord
                        if (tempWord.equals(endWord)) {
                            return pathLength + 1;
                        }
                        // If the word is not in the dictionary
                        if (!words.contains(tempWord)) {
                            continue;
                        }
                        // Remove this word from the dictionary
                        words.remove(tempWord);
                        // Add this word to the queue
                        nodes.offer(tempWord);
                    }
                    // Replace the originalCharacter
                    word[j] = originalCharacter;
                }
            }
        }
        return 0;
    }
}
