package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class PairsOfSongsWithTotalDurationsDivisibleBy60 {

    public int numPairsDivisibleBy60(int[] time) {
        // Special case
        if (time == null || time.length < 2) {
            return 0;
        }
        // Variable to store the count of total pairs
        int pairs = 0;
        // Array of size 60 which will store the count
        // of all the songs with length % 60.
        int[] modulos = new int[60];
        // Loop through the array to process every song
        for (int t : time) {
            // Make sure we consider the case where t is a multiple of 60, in that case,
            // (60 - t % 60) will become 60 - 0 = 60. Thus, we have to take extra modulus
            // so that we can get the value stored at 60 % 60 = 0.
            pairs += modulos[(60 - t % 60) % 60];
            // Update the frequency of the song
            modulos[t % 60]++;
        }
        return pairs;
    }
}
