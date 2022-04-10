package org.redquark.onlinejudges.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Anirudh Sharma
 */
public class BaseballGame {

    public int calPoints(String[] ops) {
        // Special case
        if (ops == null || ops.length == 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        // Deque to store the records
        // Why Deque over stack? See this - https://stackoverflow.com/questions/12524826
        Deque<Integer> records = new ArrayDeque<>();
        // Simulate the process by looping through each
        // element of the array
        for (String o : ops) {
            switch (o) {
                case "C" -> records.pop();
                case "D" -> records.push(records.peek() * 2);
                case "+" -> {
                    // Get previous two scores
                    int firstScore = records.pop();
                    int secondScore = records.pop();
                    // Add those two scores in the LIFO manner
                    records.push(secondScore);
                    records.push(firstScore);
                    // Add the sum of previous two scores
                    records.push(firstScore + secondScore);
                }
                default -> records.push(Integer.parseInt(o));
            }
        }
        // Final score will be sum of all the scores present
        // in the stack
        int finalScore = 0;
        while (!records.isEmpty()) {
            finalScore += records.pop();
        }
        return finalScore;
    }
}
