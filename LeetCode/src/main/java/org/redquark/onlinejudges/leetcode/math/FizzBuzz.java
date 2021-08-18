package org.redquark.onlinejudges.leetcode.math;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        // List to store the output
        List<String> output = new ArrayList<>();
        // Base case
        if (n <= 0) {
            return output;
        }
        // Loop until n
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                output.add("Fizz");
            } else if (i % 3 != 0 && i % 5 == 0) {
                output.add("Buzz");
            } else if (i % 15 == 0) {
                output.add("FizzBuzz");
            } else {
                output.add(String.valueOf(i));
            }
        }
        return output;
    }
}
