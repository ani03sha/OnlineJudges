package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class MinimumDominoRotationsForEqualRow {

    public int minDominoRotations(int[] tops, int[] bottoms) {
            /* The solution to this problem boils down to the fact that
               we need to make all values in tops same, all values in
               bottoms same.
               We can try to make all values in both arrays equal to either
               tops[0] or bottoms[0]. This will give us four combinations.
               And we will find out the minimum number of rotations among
               four cases.
            */
        // 1. Make values in tops equal to tops[0]
        int w = getMinimumRotations(tops[0], tops, bottoms);
        // 2. Make values in bottoms equal to tops[0].
        int x = getMinimumRotations(tops[0], bottoms, tops);
        // 3. Make values in tops equal to bottoms[0].
        int y = getMinimumRotations(bottoms[0], tops, bottoms);
        // 4. Make values in bottoms equal to bottoms[0].
        int z = getMinimumRotations(bottoms[0], bottoms, tops);
        // Find the minimum rotations among four
        int minimumRotations = Math.min(w, Math.min(x, Math.min(y, z)));
        return minimumRotations == Integer.MAX_VALUE ? -1 : minimumRotations;
    }

    private int getMinimumRotations(int value, int[] a, int[] b) {
        // Count of rotations
        int rotations = 0;
        // Loop through the arrays
        for (int i = 0; i < a.length; i++) {
            // Check if the current value in a is equal to the target value.
            // If it is, we don't need the swap, otherwise, we do.
            if (a[i] != value) {
                if (b[i] != value) {
                    // Rotation is not possible
                    return Integer.MAX_VALUE;
                } else {
                    rotations++;
                }
            }
        }
        return rotations;
    }
}
