package org.redquark.onlinejudges.leetcode.array;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 */
public class BoatsToSavePeople {

    public int numRescueBoats(int[] people, int limit) {
        // Number of boats required
        int boats = 0;
        // Sort the array in increasing order
        Arrays.sort(people);
        // Left pointer
        int left = 0;
        // Right pointer
        int right = people.length - 1;
        // Loop until both the pointers meet
        while (left <= right) {
            // Check if the lightest and heaviest person
            // can be put in the boat
            if (people[left] + people[right] <= limit) {
                left++;
                right--;
            }
            // If not, we will take only the heaviest person
            else {
                right--;
            }
            boats++;
        }
        return boats;
    }
}
