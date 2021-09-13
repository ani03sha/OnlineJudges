package org.redquark.onlinejudges.leetcode.string;

/**
 * @author Anirudh Sharma
 */
public class MaximumNumberOfBalloons {

    public int maxNumberOfBalloons(String text) {
        // Special case
        if (text == null || text.isEmpty()) {
            return 0;
        }
        // Counters for characters of "balloon"
        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;
        // Loop through the text
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case 'b' -> b++;
                case 'a' -> a++;
                case 'l' -> l++;
                case 'o' -> o++;
                case 'n' -> n++;
            }
        }
        // Find the minimum occurrence
        return Math.min(b, Math.min(a, Math.min(l / 2, Math.min(o / 2, n))));
    }
}
