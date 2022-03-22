package org.redquark.onlinejudges.leetcode.string;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 */
public class SmallestStringWithAGivenNumericValue {

    public String getSmallestString(int n, int k) {
        // We have to think greedily to solve this problem. A lexicographically
        // smallest string satisfying the property should be full of "a"s.
        // We have to start from the right and fill the characters in the result.

        // Character array to store the resultant string
        char[] answer = new char[n];
        // Fill this answer array with "a"s to get our answer greedily.
        Arrays.fill(answer, 'a');
        // Reduce the value of k by n
        k -= n;
        // Loop until k reaches 0;
        while (n > 0 && k > 0) {
            // To fill the array, we should minimize k by taking out
            // maximum from it
            int minimum = Math.min(k, 25);
            answer[--n] = (char) (minimum + 'a');
            k -= minimum;
        }
        return String.valueOf(answer);
    }
}
