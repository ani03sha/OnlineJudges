package org.redquark.onlinejudges.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class QueueReconstructionByHeight {

    public int[][] reconstructQueue(int[][] people) {
        // Sort the subarray for tallest people
        Arrays.sort(people, (a, b) -> a[0] != b[0] ? b[0] - a[0] : a[1] - b[1]);
        // Temporary list to add people
        List<int[]> temp = new ArrayList<>();
        for (int[] person : people) {
            temp.add(person[1], person);
        }
        // Resultant queue
        int[][] result = new int[people.length][2];
        for (int i = 0; i < temp.size(); i++) {
            result[i][0] = temp.get(i)[0];
            result[i][1] = temp.get(i)[1];
        }
        return result;
    }
}
