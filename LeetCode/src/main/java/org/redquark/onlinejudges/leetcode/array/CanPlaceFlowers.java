package org.redquark.onlinejudges.leetcode.array;

public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // Special case
        if (flowerbed == null || flowerbed.length == 0) {
            return false;
        }
        // Count of consecutive empty spaces between two flowers
        int emptyCount = 1;
        // Loop through the array of flowers
        for (int plot : flowerbed) {
            // Update empty count as long as we are encountering zero
            if (plot == 0) {
                emptyCount++;
            } else {
                // Now, we can place only (emptyCount - 1) / 2 flowers to satisfy the
                // condition that no two flowers are adjacent
                n -= (emptyCount - 1) / 2;
                // Reset the empty count for the next empty spaces
                emptyCount = 0;
            }
        }
        // Handle the case where there are empty spaces at the end
        if (emptyCount != 0) {
            n -= emptyCount / 2;
        }
        // At this point, if we are able to use all flowers, then we should
        // return true, false otherwise
        return n <= 0;
    }
}
