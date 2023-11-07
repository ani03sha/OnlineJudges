package org.redquark.onlinejudges.leetcode.array;

import java.util.Arrays;

public class EliminateMaximumNumberOfMonsters {

    public int eliminateMaximum(int[] distance, int[] speed) {
        // Total number of monsters
        int n = distance.length;
        // Array to store time taken for each monster to arrive
        int[] time = new int[n];
        for (int i = 0; i < n; i++) {
            // Time = distance / speed, duh :)
            time[i] = (distance[i] - 1) / speed[i];
        }
        // Sort the array in order of arrival
        Arrays.sort(time);
        for (int i = 0; i < n; i++) {
            if (time[i] < i) {
                return i;
            }
        }
        return n;
    }
}
