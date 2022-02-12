package org.redquark.onlinejudges.leetcode.string;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;

/**
 * @author Anirudh Sharma
 */
public class WordLadder {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        // Special case
        if (wordList == null || wordList.isEmpty()) {
            return 0;
        }
        // Set to store all the words in the list. This is being done
        // so that the search operation becomes O(1)
        Set<String> words = new HashSet<>(wordList);
        // check if the endWord exists in the list
        if (!words.contains(endWord)) {
            return 0;
        }
        // Now, we have to perform the search using BFS. First, we will
        // search the neighbors of beginWord and then their neighbors
        // and so on.
        Queue<String> queue = new LinkedList<>();
        // Add beginWord to the queue
        queue.offer(beginWord);
        // Level of the ladder
        int level = 1;
        // Perform BFS
        while (!queue.isEmpty()) {
            // Get the words at the current level
            int size = queue.size();
            // Loop through all the words at the current level
            for (int i = 0; i < size; i++) {
                // Get the current word
                char[] currentWord = Objects.requireNonNull(queue.poll()).toCharArray();
                // Check for every combination of alphabets in
                // in the current word
                for (int j = 0; j < endWord.length(); j++) {
                    // Original character in the current word
                    char originalCharacter = currentWord[j];
                    // Try putting all lower case alphabets to see if the
                    // resultant word is present in the words list
                    for (char c = 'a'; c <= 'z'; c++) {
                        // Replace the current alphabet at the j-th position
                        // in the current word
                        currentWord[j] = c;
                        // Check if the new word is present in the words list
                        if (words.contains(String.valueOf(currentWord))) {
                            // Check if this word is equal to the endWord
                            if (endWord.equals(String.valueOf(currentWord))) {
                                return level + 1;
                            }
                            // Remove it from the set as it has been considered
                            words.remove(String.valueOf(currentWord));
                            // Add it to the queue for next iteration
                            queue.offer(String.valueOf(currentWord));
                        }
                    }
                    // Restore the original character in the current word
                    currentWord[j] = originalCharacter;
                }
            }
            level++;
        }
        return 0;
    }
}
