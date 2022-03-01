package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class CountingBits {

    public int[] countBits(int n) {
        // Array to store the final result
        int[] result = new int[n + 1];
        // Offset
        int offset = 1;
        // Loop through all the numbers
        for (int i = 1; i < n + 1; i++) {
            // Everything from here is just about finding the pattern
            // See the following values:
            // result[0] = 0;
            // result[1] = 1 => result[0] + 1 => result[1 - 1] + 1
            // result[2] = 1 => result[0] + 1 => result[2 - 2] + 1
            // result[3] = 2 => result[1] + 1 => result[3 - 2] + 1
            // result[4] = 2 => result[0] + 1 => result[4 - 4] + 1
            // result[5] = 2 => result[1] + 1 => result[5 - 4] + 1
            // result[6] = 2 => result[2] + 1 => result[6 - 4] + 1
            // result[7] = 3 => result[3] + 1 => result[7 - 4] + 1
            // result[8] = 1 => result[8] + 1 => result[8 - 8] + 1
            // result[9] = 2 => result[1] + 1 => result[9 - 8] + 1
            // and so on...
            // We can see that the offset value is increasing by power of 2
            if (offset * 2 == i) {
                offset *= 2;
            }
            result[i] = result[i - offset] + 1;
        }
        return result;
    }
}
