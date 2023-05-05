package org.redquark.onlinejudges.leetcode.string;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {

    public int maxVowels(String s, int k) {
        // Special case
        if (s == null || s.length() < k) {
            return 0;
        }
        // Length of the string
        int n = s.length();
        // Start and end pointers of the sliding window
        int start = 0;
        int end = 0;
        // Global count of maximum vowels in a window
        int maximumVowelCount = 0;
        // Count of vowels in the current window
        int currentVowelCount = 0;
        // For th first window of size k
        while (end < k) {
            if (isVowel(s.charAt(end))) {
                currentVowelCount++;
            }
            end++;
        }
        // Update maximumVowelCount, if required
        maximumVowelCount = Math.max(maximumVowelCount, currentVowelCount);
        // Reset the currentVowelCount;
        currentVowelCount = maximumVowelCount;
        // Traverse through the remaining string in the
        // sliding window
        while (end < n) {
            // If the character at the start index is a vowel,
            // we have to remove it from the currentVowelCount
            if (isVowel(s.charAt(start))) {
                currentVowelCount--;
            }
            // If the character at the end index is a vowel,
            // we have to add it to the currentVowelCount;
            if (isVowel(s.charAt(end))) {
                currentVowelCount++;
            }
            // Update the maximumVowelCount, if required
            maximumVowelCount = Math.max(currentVowelCount, maximumVowelCount);
            start++;
            end++;
        }
        return maximumVowelCount;
    }

    private boolean isVowel(char c) {
        return c == 'a'
                || c == 'e'
                || c == 'i'
                || c == 'o'
                || c == 'u';
    }
}
