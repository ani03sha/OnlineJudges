package org.redquark.onlinejudges.leetcode.array;

public class LastMomentBeforeAllAntsFallOutOfAPlank {

    public int getLastMoment(int n, int[] left, int[] right) {
        // Collision doesn't matter at all!!!
        // Because the ants who collide will change direction thrice
        // 1. When it will collide with the ant moving in the opposite direction
        // 2. Once it changes direction, it will collide with the ant which was just behind it. In this case, the ant which was behind will change its direction to the edge of the plank
        // 3. Now, our original ant will again change direction but this time, after changing direction, it won't collide with the ant behind it as it was already moving towards its doom
        // Thus, the total time will be the maximum of the farthest ant from the opposite edge of the plank
        int timeTaken = 0;
        for (int element : left) {
            timeTaken = Math.max(timeTaken, element);
        }
        for (int element : right) {
            timeTaken = Math.max(timeTaken, n - element);
        }
        return timeTaken;
    }
}
