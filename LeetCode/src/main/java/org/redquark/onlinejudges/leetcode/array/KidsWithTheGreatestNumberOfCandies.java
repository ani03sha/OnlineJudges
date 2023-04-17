package org.redquark.onlinejudges.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // List to store statuses of kids with the greatest number
        // of candies
        List<Boolean> candyStatuses = new ArrayList<>();
        // Special case
        if (candies == null || candies.length == 0) {
            return candyStatuses;
        }
        // Find the maximum number of candies already present
        int maxCandyCount = 0;
        for (int candy : candies) {
            maxCandyCount = Math.max(maxCandyCount, candy);
        }
        // Populate the candyStatuses list
        for (int candy : candies) {
            candyStatuses.add(candy + extraCandies >= maxCandyCount);
        }
        return candyStatuses;
    }
}
