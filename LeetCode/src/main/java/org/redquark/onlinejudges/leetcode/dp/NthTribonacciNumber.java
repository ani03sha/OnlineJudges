package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class NthTribonacciNumber {

    public int tribonacci(int n) {
        // Special cases
        if (n == 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        }
        int a = 0;
        int b = 1;
        int c = 1;
        int d = 0;
        for (int i = 3; i <= n; i++) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return d;
    }
}
